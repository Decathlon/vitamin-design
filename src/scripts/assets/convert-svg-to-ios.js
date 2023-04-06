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

['', 'flag/', 'logo/', 'placeholder/'].forEach((path) => {
  fs.writeFileSync(
    `build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/${path}Contents.json`,
    JSON.stringify(mainContentsJson, null, 2)
  );
});

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
});

vitaminAssetsCoreFile += `  }
  public enum Logo {
`;

shell.ls('build/assets/svg/logos').forEach((file) => {
  const data = fs.readFileSync(`build/assets/svg/logos/${file}`);

  const directoryName =
    file !== 'decathlon-logo-with-outline.svg'
      ? `logo/${file.split('.svg')[0].split('decathlon-')[1]}.imageset`
      : 'logo/logo-outlined.imageset';
  const fileName =
    file !== 'decathlon-logo-with-outline.svg'
      ? `${file.split('.svg')[0].split('decathlon-')[1]}.pdf`
      : 'logo-outlined.pdf';

  vitaminAssetsCoreFile += `    public static let ${camelize(
    fileName.split('.pdf')[0].replaceAll('-', ' ')
  )} = VitaminAsset(name: "${fileName.split('.pdf')[0]}")\n`;

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
});

vitaminAssetsCoreFile += `  }
  public enum Payment {
    public static let amazonPay = VitaminAsset(name: "AmazonPay")
    public static let amex = VitaminAsset(name: "Amex")
    public static let applePay = VitaminAsset(name: "ApplePay")
    public static let bvr = VitaminAsset(name: "BVR")
    public static let bancontactPayconiq = VitaminAsset(name: "Bancontact-payconiq")
    public static let bancontact = VitaminAsset(name: "Bancontact")
    public static let belfius = VitaminAsset(name: "Belfius")
    public static let bitcoin = VitaminAsset(name: "Bitcoin")
    public static let bitpay = VitaminAsset(name: "Bitpay")
    public static let cb = VitaminAsset(name: "CB")
    public static let cadhoc = VitaminAsset(name: "Cadhoc")
    public static let cash = VitaminAsset(name: "Cash")
    public static let chequePayment = VitaminAsset(name: "ChequePayment")
    public static let clickandBuy = VitaminAsset(name: "ClickandBuy")
    public static let dinersClubInternational = VitaminAsset(name: "DinersClubInternational")
    public static let discover = VitaminAsset(name: "Discover")
    public static let dwolla = VitaminAsset(name: "Dwolla")
    public static let eps = VitaminAsset(name: "EPS")
    public static let elo = VitaminAsset(name: "Elo")
    public static let eway = VitaminAsset(name: "Eway")
    public static let giftCardPayment = VitaminAsset(name: "GiftCardPayment")
    public static let giroPay = VitaminAsset(name: "GiroPay")
    public static let googlePay = VitaminAsset(name: "GooglePay")
    public static let ing = VitaminAsset(name: "ING")
    public static let illicado = VitaminAsset(name: "Illicado")
    public static let ingenico = VitaminAsset(name: "Ingenico")
    public static let jcb = VitaminAsset(name: "JCB")
    public static let kbc = VitaminAsset(name: "KBC")
    public static let klarna = VitaminAsset(name: "Klarna")
    public static let mbMultibanco = VitaminAsset(name: "MB-Multibanco")
    public static let mbWay = VitaminAsset(name: "MB-Way")
    public static let mnp = VitaminAsset(name: "MNP")
    public static let maestroFull = VitaminAsset(name: "Maestro Full")
    public static let maestro = VitaminAsset(name: "Maestro")
    public static let masterCardIDCheck = VitaminAsset(name: "MasterCard ID Check")
    public static let mastercardFull = VitaminAsset(name: "Mastercard Full")
    public static let mastercard = VitaminAsset(name: "Mastercard")
    public static let neteller = VitaminAsset(name: "Neteller")
    public static let oneyClassic = VitaminAsset(name: "Oney Classic")
    public static let oney3x = VitaminAsset(name: "Oney3x")
    public static let oney3x4x = VitaminAsset(name: "Oney3x4x")
    public static let oney4x = VitaminAsset(name: "Oney4x")
    public static let payU = VitaminAsset(name: "PayU")
    public static let paylib = VitaminAsset(name: "Paylib")
    public static let paymill = VitaminAsset(name: "Paymill")
    public static let payoneer = VitaminAsset(name: "Payoneer")
    public static let paypal = VitaminAsset(name: "Paypal")
    public static let paysafeCard = VitaminAsset(name: "PaysafeCard")
    public static let pointsPay = VitaminAsset(name: "PointsPay")
    public static let postFinanceCard = VitaminAsset(name: "PostFinanceCard")
    public static let postFinanceEFinance = VitaminAsset(name: "PostFinanceE-Finance")
    public static let postePay = VitaminAsset(name: "PostePay")
    public static let powerPay = VitaminAsset(name: "PowerPay")
    public static let przelewy24 = VitaminAsset(name: "Przelewy24")
    public static let sepa = VitaminAsset(name: "SEPA")
    public static let skrill = VitaminAsset(name: "Skrill")
    public static let spiritOfCadeau = VitaminAsset(name: "Spirit of cadeau")
    public static let stripe = VitaminAsset(name: "Stripe")
    public static let unionPay = VitaminAsset(name: "UnionPay")
    public static let verifone = VitaminAsset(name: "Verifone")
    public static let visaClassic = VitaminAsset(name: "Visa Classic")
    public static let visaElectron = VitaminAsset(name: "Visa Electron")
    public static let wallet = VitaminAsset(name: "Wallet")
    public static let webMoney = VitaminAsset(name: "WebMoney")
    public static let westernUnion = VitaminAsset(name: "WesternUnion")
    public static let iDeal = VitaminAsset(name: "iDeal")
  }
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
});

assetsModelSectionsFile += `        Assets.Section(name: "Flags", items: [\n`;
shell.ls('build/assets/svg/flags').forEach((file, index) => {
  assetsModelSectionsFile += `            VitaminAssets.Flag.${file
    .split('.svg')[0]
    .split('flag')[1]
    .replaceAll('-', '')}${
    index !== shell.ls('build/assets/svg/flags').length - 1 ? ',' : ''
  }\n`;
});
assetsModelSectionsFile += `        ]),\n`;

assetsModelSectionsFile += `        AssetsModel.Section(name: "Payment", items: [
            VitaminAssets.Payment.amazonPay,
            VitaminAssets.Payment.amex,
            VitaminAssets.Payment.applePay,
            VitaminAssets.Payment.bvr,
            VitaminAssets.Payment.bancontactPayconiq,
            VitaminAssets.Payment.bancontact,
            VitaminAssets.Payment.belfius,
            VitaminAssets.Payment.bitcoin,
            VitaminAssets.Payment.bitpay,
            VitaminAssets.Payment.cb,
            VitaminAssets.Payment.cadhoc,
            VitaminAssets.Payment.cash,
            VitaminAssets.Payment.clickandBuy,
            VitaminAssets.Payment.dinersClubInternational,
            VitaminAssets.Payment.discover,
            VitaminAssets.Payment.dwolla,
            VitaminAssets.Payment.eps,
            VitaminAssets.Payment.elo,
            VitaminAssets.Payment.eway,
            VitaminAssets.Payment.giroPay,
            VitaminAssets.Payment.googlePay,
            VitaminAssets.Payment.ing,
            VitaminAssets.Payment.illicado,
            VitaminAssets.Payment.ingenico,
            VitaminAssets.Payment.jcb,
            VitaminAssets.Payment.kbc,
            VitaminAssets.Payment.klarna,
            VitaminAssets.Payment.mbMultibanco,
            VitaminAssets.Payment.mbWay,
            VitaminAssets.Payment.mnp,
            VitaminAssets.Payment.maestroFull,
            VitaminAssets.Payment.maestro,
            VitaminAssets.Payment.masterCardIDCheck,
            VitaminAssets.Payment.mastercardFull,
            VitaminAssets.Payment.mastercard,
            VitaminAssets.Payment.neteller,
            VitaminAssets.Payment.oneyClassic,
            VitaminAssets.Payment.oney3x,
            VitaminAssets.Payment.oney3x4x,
            VitaminAssets.Payment.oney4x,
            VitaminAssets.Payment.payU,
            VitaminAssets.Payment.paylib,
            VitaminAssets.Payment.paymill,
            VitaminAssets.Payment.payoneer,
            VitaminAssets.Payment.paypal,
            VitaminAssets.Payment.paysafeCard,
            VitaminAssets.Payment.pointsPay,
            VitaminAssets.Payment.postFinanceCard,
            VitaminAssets.Payment.postFinanceEFinance,
            VitaminAssets.Payment.postePay,
            VitaminAssets.Payment.powerPay,
            VitaminAssets.Payment.przelewy24,
            VitaminAssets.Payment.sepa,
            VitaminAssets.Payment.skrill,
            VitaminAssets.Payment.spiritOfCadeau,
            VitaminAssets.Payment.stripe,
            VitaminAssets.Payment.unionPay,
            VitaminAssets.Payment.verifone,
            VitaminAssets.Payment.visaClassic,
            VitaminAssets.Payment.visaElectron,
            VitaminAssets.Payment.webMoney,
            VitaminAssets.Payment.westernUnion,
            VitaminAssets.Payment.iDeal,
            VitaminAssets.Payment.wallet,
            VitaminAssets.Payment.giftCardPayment,
            VitaminAssets.Payment.chequePayment
        ]),\n`;

assetsModelSectionsFile += `        Assets.Section(name: "Placeholders", items: [\n`;
shell.ls('build/assets/svg/placeholders').forEach((file, index) => {
  assetsModelSectionsFile += `            VitaminAssets.Placeholder.${camelize(
    file.split('.svg')[0].split('-placeholder')[0]
  ).replaceAll('-', '')}${
    index !== shell.ls('build/assets/svg/placeholders').length - 1 ? ',' : ''
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
