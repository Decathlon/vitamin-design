const shell = require('shelljs');
const fs = require('fs');
require('dotenv').config();

const figmaApiAccessToken = process.env.FIGMA_API_ACCESS_TOKEN;
const vitaminIconsFileId = 'ujn50nNMfGKzZJccATv7Vk';
const vitaminIconsPage = 'Export for developers';

const iconsConfigBase = {
  figmaPersonalToken: figmaApiAccessToken,
  fileId: vitaminIconsFileId,
  page: vitaminIconsPage,
};

const iconsConfigFill = {
  ...iconsConfigBase,
  frame: 'icon-fill',
  iconsPath: 'icons/svg/fill',
};

const iconsConfigLine = {
  ...iconsConfigBase,
  frame: 'icon-line',
  iconsPath: 'icons/svg/line',
};

// Icons: Create a `.temp` folder
shell.mkdir('-p', '.temp');

fs.writeFileSync(
  `.temp/icons-config-fill.json`,
  JSON.stringify(iconsConfigFill)
);

fs.writeFileSync(
  `.temp/icons-config-line.json`,
  JSON.stringify(iconsConfigLine)
);

// Icons: Export `.svg` fill files
shell.exec('npx export-icons --config=.temp/icons-config-fill.json');

// Icons: Export `.svg` line files
shell.exec('npx export-icons --config=.temp/icons-config-line.json');

// Icons: Copy to a folder that contains all
shell.cp('-r', 'icons/svg/fill/*.svg', 'icons/svg/all');
shell.cp('-r', 'icons/svg/line/*.svg', 'icons/svg/all');

// Icons: Clean svg folder
shell.rm('-rf', '.temp');
