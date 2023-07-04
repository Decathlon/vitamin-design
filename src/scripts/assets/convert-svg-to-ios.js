const fs = require('fs');
const shell = require('shelljs');
const PDFDocument = require('pdfkit');
const SVGtoPDF = require('svg-to-pdfkit');
const capitalize = require('../../utils/capitalize');
const camelize = require('../../utils/camelize');

const mainContentsJson = {
  info: {
    author: 'xcode',
    version: 1,
  },
};
const assetContentsJson = (fileName) => ({
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
});

let vitaminAssetsComments = `// swiftlint:disable all
// Generated using SwiftGen — https://github.com/SwiftGen/SwiftGen`;

let vitaminAssetsCoreFile = `${vitaminAssetsComments}

import UIKit

// swiftlint:disable superfluous_disable_command file_length implicit_return

// MARK: - Asset Catalogs

// swiftlint:disable identifier_name line_length nesting type_body_length type_name
public enum VitaminAssets {
`;

let assetsModelSectionsFile = `//
//  Vitamin iOS
//  Apache License 2.0
//

import Foundation
import VitaminCore

enum AssetsModel {
    struct Section: Identifiable {
        var id: String {
            name
        }
        let name: String
        let items: [VitaminAsset]
    }

    static let sections = [
`;

['', 'flag/', 'logo/', 'payment/', 'placeholder/', 'shipping/'].forEach(
  (path) => {
    fs.writeFileSync(
      `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${path}Contents.json`,
      JSON.stringify(mainContentsJson, null, 2)
    );
  }
);

vitaminAssetsCoreFile += `  public enum Flag {
`;

shell.ls('build/assets/svg/flags').forEach((file) => {
  const data = fs.readFileSync(`build/assets/svg/flags/${file}`);
  const directoryName = `flag/${file
    .split('.svg')[0]
    .split('flag')[1]
    .toUpperCase()
    .replaceAll('-', '')}.imageset`;
  const fileName = `${file
    .split('.svg')[0]
    .split('flag')[1]
    .toUpperCase()
    .replaceAll('-', '')}.pdf`;

  let varName = file.split('.svg')[0].split('flag')[1].replaceAll('-', '');

  if (
    varName === 'is' ||
    varName === 'do' ||
    varName == 'as' ||
    varName == 'in'
  ) {
    varName = `\`${varName}\``;
  }

  vitaminAssetsCoreFile += `    public static let ${varName} = VitaminAsset(name: "${file
    .split('.svg')[0]
    .split('flag')[1]
    .toUpperCase()
    .replaceAll('-', '')}")\n`;

  fs.readFile(`.temp-svg-assets/all/${file}`, (err, _) => {
    if (err && err.code && err.code === 'ENOENT') {
      shell.mkdir(
        `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}`
      );
      fs.writeFileSync(
        `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/Contents.json`,
        JSON.stringify(assetContentsJson(fileName), null, 2)
      );

      const doc = new PDFDocument({ size: [64, 64] }),
        stream = fs.createWriteStream(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/${fileName}`
        ),
        svg = data.toString();

      SVGtoPDF(doc, svg, 0, 0);

      doc.pipe(stream);
      doc.end();
    }
  });
});

vitaminAssetsCoreFile += `  }
  public enum Logo {
`;

shell.ls('build/assets/svg/logos').forEach((file) => {
  const data = fs.readFileSync(`build/assets/svg/logos/${file}`);

  const directoryName = `logo/${
    file.split('.svg')[0].split('decathlon-')[1]
  }.imageset`;
  const fileName = `${file.split('.svg')[0].split('decathlon-')[1]}.pdf`;

  vitaminAssetsCoreFile += `    public static let ${camelize(
    fileName.split('.pdf')[0].replaceAll('-', ' ')
  )} = VitaminAsset(name: "${fileName.split('.pdf')[0]}")\n`;

  fs.readFile(`.temp-svg-assets/all/${file}`, (err, data1) => {
    if (err) throw err;
    fs.readFile(`build/assets/svg/all/${file}`, (err, data2) => {
      if (err) throw err;
      if (!data1.equals(data2)) {
        shell.mkdir(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}`
        );
        fs.writeFileSync(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/Contents.json`,
          JSON.stringify(assetContentsJson(fileName), null, 2)
        );

        const doc = new PDFDocument({ size: [64, 64] }),
          stream = fs.createWriteStream(
            `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/${fileName}`
          ),
          svg = data.toString();

        SVGtoPDF(doc, svg, 0, 0);

        doc.pipe(stream);
        doc.end();
      }
    });
  });
});

vitaminAssetsCoreFile += `  }
  public enum Payment {
`;

shell.ls('build/assets/svg/payments').forEach((file) => {
  const data = fs.readFileSync(`build/assets/svg/payments/${file}`);

  const directoryName = `payment/${file.split('.svg')[0]}.imageset`;
  const fileName = `${file.split('.svg')[0]}.pdf`;

  vitaminAssetsCoreFile += `    public static let ${camelize(
    fileName.split('.pdf')[0].replaceAll('-', ' ')
  )} = VitaminAsset(name: "${fileName.split('.pdf')[0]}")\n`;

  fs.readFile(`.temp-svg-assets/all/${file}`, (err, data1) => {
    if (err) throw err;
    fs.readFile(`build/assets/svg/all/${file}`, (err, data2) => {
      if (err) throw err;
      if (!data1.equals(data2)) {
        shell.mkdir(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}`
        );
        fs.writeFileSync(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/Contents.json`,
          JSON.stringify(assetContentsJson(fileName), null, 2)
        );

        const doc = new PDFDocument({ size: [64, 64] }),
          stream = fs.createWriteStream(
            `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/${fileName}`
          ),
          svg = data.toString();

        SVGtoPDF(doc, svg, 0, 0);

        doc.pipe(stream);
        doc.end();
      }
    });
  });
});

vitaminAssetsCoreFile += `  }
  public enum Placeholder {
`;

shell.ls('build/assets/svg/placeholders').forEach((file) => {
  const data = fs.readFileSync(`build/assets/svg/placeholders/${file}`);

  const directoryName = `placeholder/${
    file.split('.svg')[0].split('-placeholder')[0]
  }.imageset`;
  const fileName = `${file.split('.svg')[0].split('-placeholder')[0]}.pdf`;

  vitaminAssetsCoreFile += `    public static let ${camelize(
    fileName.split('.pdf')[0].replaceAll('-', ' ')
  )} = VitaminAsset(name: "${fileName.split('.pdf')[0]}")\n`;

  fs.readFile(`.temp-svg-assets/all/${file}`, (err, data1) => {
    if (err) throw err;
    fs.readFile(`build/assets/svg/all/${file}`, (err, data2) => {
      if (err) throw err;
      if (!data1.equals(data2)) {
        shell.mkdir(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}`
        );
        fs.writeFileSync(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/Contents.json`,
          JSON.stringify(assetContentsJson(fileName), null, 2)
        );

        const doc = new PDFDocument({ size: [64, 64] }),
          stream = fs.createWriteStream(
            `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/${fileName}`
          ),
          svg = data.toString();

        SVGtoPDF(doc, svg, 0, 0);

        doc.pipe(stream);
        doc.end();
      }
    });
  });
});

vitaminAssetsCoreFile += `  }
  public enum Shipping {
`;

shell.ls('build/assets/svg/shipping').forEach((file) => {
  const data = fs.readFileSync(`build/assets/svg/shipping/${file}`);

  const directoryName = `shipping/${file.split('.svg')[0]}.imageset`;
  const fileName = `${file.split('.svg')[0]}.pdf`;

  vitaminAssetsCoreFile += `    public static let ${camelize(
    fileName.split('.pdf')[0].replaceAll('-', ' ')
  )} = VitaminAsset(name: "${fileName.split('.pdf')[0]}")\n`;

  fs.readFile(`.temp-svg-assets/all/${file}`, (err, data1) => {
    if (err) throw err;
    fs.readFile(`build/assets/svg/all/${file}`, (err, data2) => {
      if (err) throw err;
      if (!data1.equals(data2)) {
        shell.mkdir(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}`
        );
        fs.writeFileSync(
          `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/Contents.json`,
          JSON.stringify(assetContentsJson(fileName), null, 2)
        );

        const doc = new PDFDocument({ size: [64, 64] }),
          stream = fs.createWriteStream(
            `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${directoryName}/${fileName}`
          ),
          svg = data.toString();

        SVGtoPDF(doc, svg, 0, 0);

        doc.pipe(stream);
        doc.end();
      }
    });
  });
});

shell.rm('-rf', '.temp-svg-assets');

assetsModelSectionsFile += `        AssetsModel.Section(name: "Flags", items: [\n`;
shell.ls('build/assets/svg/flags').forEach((file, index) => {
  assetsModelSectionsFile += `            VitaminAssets.Flag.${file
    .split('.svg')[0]
    .split('flag')[1]
    .replaceAll('-', '')}${
    index !== shell.ls('build/assets/svg/flags').length - 1 ? ',' : ''
  }\n`;
});
assetsModelSectionsFile += `        ]),\n`;

assetsModelSectionsFile += `        AssetsModel.Section(name: "Logos", items: [\n`;
shell.ls('build/assets/svg/logos').forEach((file, index) => {
  assetsModelSectionsFile += `            VitaminAssets.Logo.${camelize(
    file.split('.svg')[0].split('decathlon-')[1].replaceAll('-', ' ')
  )}${index !== shell.ls('build/assets/svg/logos').length - 1 ? ',' : ''}\n`;
});
assetsModelSectionsFile += `        ]),\n`;

assetsModelSectionsFile += `        AssetsModel.Section(name: "Payments", items: [\n`;
shell.ls('build/assets/svg/payments').forEach((file, index) => {
  assetsModelSectionsFile += `            VitaminAssets.Payment.${camelize(
    file.split('.svg')[0].replaceAll('-', ' ')
  )}${index !== shell.ls('build/assets/svg/payments').length - 1 ? ',' : ''}\n`;
});
assetsModelSectionsFile += `        ]),\n`;

assetsModelSectionsFile += `        AssetsModel.Section(name: "Placeholders", items: [\n`;
shell.ls('build/assets/svg/placeholders').forEach((file, index) => {
  assetsModelSectionsFile += `            VitaminAssets.Placeholder.${camelize(
    file.split('.svg')[0].split('-placeholder')[0]
  ).replaceAll('-', '')}${
    index !== shell.ls('build/assets/svg/placeholders').length - 1 ? ',' : ''
  }\n`;
});
assetsModelSectionsFile += `        ]),\n`;

assetsModelSectionsFile += `        AssetsModel.Section(name: "Shipping", items: [\n`;
shell.ls('build/assets/svg/shipping').forEach((file, index) => {
  assetsModelSectionsFile += `            VitaminAssets.Shipping.${camelize(
    file.split('.svg')[0]
  ).replaceAll('-', '')}${
    index !== shell.ls('build/assets/svg/shipping').length - 1 ? ',' : ''
  }\n`;
});
assetsModelSectionsFile += `        ])
    ]
}`;

vitaminAssetsCoreFile += `  }
}
// swiftlint:enable identifier_name line_length nesting type_body_length type_name`;

fs.writeFileSync(
  'build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.swift',
  vitaminAssetsCoreFile
);

fs.writeFileSync(
  'build/assets/ios/Showcase/Application/Core/Foundations/Assets/AssetsModel+Sections.swift',
  assetsModelSectionsFile
);
