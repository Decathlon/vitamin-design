const fs = require('fs');
const shell = require('shelljs');
const PDFDocument = require('pdfkit');
const SVGtoPDF = require('svg-to-pdfkit');
const capitalize = require('../../utils/capitalize');

const mainContentsJson = {
  info: {
    author: 'xcode',
    version: 1,
  },
};

fs.writeFileSync(
  'build/icons/pdf/Contents.json',
  JSON.stringify(mainContentsJson, null, 2)
);

shell.ls('build/icons/svg/vitamix').forEach((file) => {
  const data = fs.readFileSync(`build/icons/svg/vitamix/${file}`);
  const directoryName = `${capitalize(file.split('.svg')[0]).replaceAll(
    '-',
    ''
  )}.imageset`;
  const fileName = `${file.split('.svg')[0]}.pdf`;
  const iconContentsJson = {
    images: [
      {
        filename: fileName,
        idiom: 'universal',
      },
    ],
    info: {
      author: 'xcode',
      version: 1,
    },
    properties: {
      'preserves-vector-representation': true,
    },
  };

  shell.mkdir(`build/icons/pdf/${directoryName}`);
  fs.writeFileSync(
    `build/icons/pdf/${directoryName}/Contents.json`,
    JSON.stringify(iconContentsJson, null, 2)
  );

  const doc = new PDFDocument({ size: [64, 64] }),
    stream = fs.createWriteStream(
      `build/icons/pdf/${directoryName}/${fileName}`
    ),
    svg = data.toString();

  SVGtoPDF(doc, svg, 0, 0);

  doc.pipe(stream);
  doc.end();
});
