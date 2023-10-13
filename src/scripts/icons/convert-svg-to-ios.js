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

const iconContentsJson = (fileName) => ({
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
    'template-rendering-intent' : 'template'
  },
});

const createPDF = (directoryName, fileName, file, svg) => {
  fs.readFile(`.temp-svg-icons/all/${file}`, (err, data1) => {
    if (err) throw err;
    fs.readFile(`build/icons/svg/all/${file}`, (err, data2) => {
      if (err) throw err;
      // if (!data1.equals(data2)) { FIXME: add the condition when 16x16 are ok on vitamin-ios

      shell.mkdir(
        `build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.xcassets/${directoryName}`
      );
      fs.writeFileSync(
        `build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.xcassets/${directoryName}/Contents.json`,
        JSON.stringify(iconContentsJson(fileName), null, 2)
      );

      const doc = new PDFDocument({ size: [16, 16] }),
        stream = fs.createWriteStream(
          `build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.xcassets/${directoryName}/${fileName}`
        );

      SVGtoPDF(doc, svg, 0, 0);

      doc.pipe(stream);
      doc.end();
      // }
    });
  });
};

let vitamixComments = `//  Vitamin iOS
//  Apache License 2.0
//

// Generated from Vitamin Design icons handoff — https://github.com/Decathlon/vitamin-design
// Do not edit manually
// swiftlint:disable all`;

let vitamixCoreFile = `//
${vitamixComments}

import Foundation

public enum Vitamix {
`;

let vitamixSwiftUIFile = `//
${vitamixComments}

#if arch(x86_64) || arch(arm64)
import SwiftUI
import VitaminCore

@available(iOS 13, *)
extension Image {
    public enum Vitamix {
`;

let vitamixUIKitFile = `//
${vitamixComments}

import UIKit
import VitaminCore

extension UIImage {
    public enum Vitamix {
`;

let iconsModelSectionsFile = `//
${vitamixComments}

import Foundation
import VitaminCore

extension IconsModel {
    static let sections = [
`;

fs.writeFileSync(
  'build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.xcassets/Contents.json',
  JSON.stringify(mainContentsJson, null, 2)
);

shell.ls('build/icons/svg/all').forEach((file) => {
  const data = fs.readFileSync(`build/icons/svg/all/${file}`);
  const directoryName = `${capitalize(file.split('.svg')[0]).replaceAll(
    '-',
    ''
  )}.imageset`;
  const fileName = `${file.split('.svg')[0]}.pdf`;

  vitamixCoreFile += `    public static let ${camelize(
    file.split('.svg')[0]
  ).replaceAll('-', '')} = VitaminAsset(name: "${capitalize(
    file.split('.svg')[0]
  ).replaceAll('-', '')}")\n`;

  vitamixSwiftUIFile += `        public static let ${camelize(
    file.split('.svg')[0]
  ).replaceAll('-', '')} = VitaminCore.Vitamix.${camelize(
    file.split('.svg')[0]
  ).replaceAll('-', '')}.image\n`;

  vitamixUIKitFile += `        public static let ${camelize(
    file.split('.svg')[0]
  ).replaceAll('-', '')} = VitaminCore.Vitamix.${camelize(
    file.split('.svg')[0]
  ).replaceAll('-', '')}.image\n`;

  createPDF(directoryName, fileName, file, data.toString());
});

shell.rm('-rf', '.temp-svg-icons');

iconsModelSectionsFile += `        IconsModel.Section(name: "Line", items: [\n`;
shell.ls('build/icons/svg/line').forEach((file, index) => {
  iconsModelSectionsFile += `            Vitamix.${camelize(
    file.split('.svg')[0]
  ).replaceAll('-', '')}${
    index !== shell.ls('build/icons/svg/line').length - 1 ? ',' : ''
  }\n`;
});
iconsModelSectionsFile += `        ]),\n`;

iconsModelSectionsFile += `        IconsModel.Section(name: "Fill", items: [\n`;
shell.ls('build/icons/svg/fill').forEach((file, index) => {
  iconsModelSectionsFile += `            Vitamix.${camelize(
    file.split('.svg')[0]
  ).replaceAll('-', '')}${
    index !== shell.ls('build/icons/svg/line').length - 1 ? ',' : ''
  }\n`;
});
iconsModelSectionsFile += `        ])
    ]
}`;

vitamixCoreFile += '}';
vitamixSwiftUIFile += `    }
}
#endif`;
vitamixUIKitFile += `    }
}`;

fs.writeFileSync(
  'build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.swift',
  vitamixCoreFile
);

fs.writeFileSync(
  'build/icons/ios/Sources/VitaminSwiftUI/Foundations/Icons/Vitamix+SwiftUI.swift',
  vitamixSwiftUIFile
);

fs.writeFileSync(
  'build/icons/ios/Sources/VitaminUIKit/Foundations/Icons/Vitamix+UIKit.swift',
  vitamixUIKitFile
);

fs.writeFileSync(
  'build/icons/ios/Showcase/Application/Core/Foundations/Icons/IconsModel+Sections.swift',
  iconsModelSectionsFile
);
