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

let vitamixComments = `//
//  Vitamin iOS
//  Apache License 2.0
//

// Generated from Vitamin Design icons handoff — https://github.com/Decathlon/vitamin-design
// Do not edit manually
// swiftlint:disable all`;

let vitamixCoreFile = `
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

  shell.mkdir(
    `build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.xcassets/${directoryName}`
  );
  fs.writeFileSync(
    `build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.xcassets/${directoryName}/Contents.json`,
    JSON.stringify(iconContentsJson, null, 2)
  );

  const doc = new PDFDocument({ size: [64, 64] }),
    stream = fs.createWriteStream(
      `build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.xcassets/${directoryName}/${fileName}`
    ),
    svg = data.toString();

  SVGtoPDF(doc, svg, 0, 0);

  doc.pipe(stream);
  doc.end();
});

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
