const shell = require('shelljs');
const fs = require('fs');
require('dotenv').config();

const figmaApiAccessToken = process.env.FIGMA_API_ACCESS_TOKEN;
const vitaminAssetsFileId = 'Fi9WjIkuax79ujCAjvyoHj';
const vitaminAssetsPage = 'Export for developers';

const assetsConfigBase = {
  figmaPersonalToken: figmaApiAccessToken,
  fileId: vitaminAssetsFileId,
  page: vitaminAssetsPage,
};

const assetsConfigFlags = {
  ...assetsConfigBase,
  frame: '_Flags',
  iconsPath: 'build/assets/svg/flags',
};

const assetsConfigLogos = {
  ...assetsConfigBase,
  frame: '_Logos',
  iconsPath: 'build/assets/svg/logos',
};

const assetsConfigPayments = {
  ...assetsConfigBase,
  frame: '_Payments',
  iconsPath: 'build/assets/svg/payments',
};

const assetsConfigPlaceholders = {
  ...assetsConfigBase,
  frame: '_Placeholders',
  iconsPath: 'build/assets/svg/placeholders',
};

// Assets: Create a `.temp` folder
shell.mkdir('-p', '.temp');

fs.writeFileSync(
  `.temp/assets-config-flags.json`,
  JSON.stringify(assetsConfigFlags)
);

fs.writeFileSync(
  `.temp/assets-config-logos.json`,
  JSON.stringify(assetsConfigLogos)
);

fs.writeFileSync(
  `.temp/assets-config-payments.json`,
  JSON.stringify(assetsConfigPayments)
);

fs.writeFileSync(
  `.temp/assets-config-placeholders.json`,
  JSON.stringify(assetsConfigPlaceholders)
);

// Assets: Export `.svg` flags files
shell.exec('npx export-icons --config=.temp/assets-config-flags.json');

// Assets: Export `.svg` logos files
shell.exec('npx export-icons --config=.temp/assets-config-logos.json');

// Assets: Export `.svg` payments files
shell.exec('npx export-icons --config=.temp/assets-config-payments.json');

// Assets: Export `.svg` placeholders files
shell.exec('npx export-icons --config=.temp/assets-config-placeholders.json');

// Assets: Copy to a folder that contains assets
shell.cp('-r', 'build/assets/svg/flags/*.svg', 'build/assets/svg/all');
shell.cp('-r', 'build/assets/svg/logos/*.svg', 'build/assets/svg/all');
shell.cp('-r', 'build/assets/svg/payments/*.svg', 'build/assets/svg/all');
shell.cp('-r', 'build/assets/svg/placeholders/*.svg', 'build/assets/svg/all');

// Assets: Clean svg folder
shell.rm('-rf', '.temp');
