const shell = require('shelljs');

// Create temp directory for svg assets with the good name
shell.mkdir('-p', '.temp-compose-assets/flags');
shell.mkdir('-p', '.temp-compose-assets/logos');
shell.mkdir('-p', '.temp-compose-assets/payments');
shell.mkdir('-p', '.temp-compose-assets/placeholders');

// Copy all assets from svg folders to temp folder
shell.cp('-r', 'build/assets/svg/flags/*.svg', '.temp-compose-assets/flags');
shell.cp('-r', 'build/assets/svg/logos/*.svg', '.temp-compose-assets/logos');
shell.cp(
  '-r',
  'build/assets/svg/payments/*.svg',
  '.temp-compose-assets/payments'
);
shell.cp(
  '-r',
  'build/assets/svg/placeholders/*.svg',
  '.temp-compose-assets/placeholders'
);

// Rename name of assets
const flags = shell.ls('.temp-compose-assets/flags');
flags.forEach((element) => {
  const xmlName = element.replace(/-/g, '_').replace(/flag/, '');
  shell.mv(
    '.temp-compose-assets/flags/' + element,
    '.temp-compose-assets/flags/' + xmlName
  );
});

const logos = shell.ls('.temp-compose-assets/logos');
logos.forEach((element) => {
  const xmlName = element.replace(/-/g, '_');
  shell.mv(
    '.temp-compose-assets/logos/' + element,
    '.temp-compose-assets/logos/' + xmlName
  );
});

const payments = shell.ls('.temp-compose-assets/payments');
payments.forEach((element) => {
  const xmlName = element.replace(/-/g, '_');
  shell.mv(
    '.temp-compose-assets/payments/' + element,
    '.temp-compose-assets/payments/' + xmlName
  );
});

const placeholders = shell.ls('.temp-compose-assets/placeholders');
placeholders.forEach((element) => {
  const xmlName = element.replace(/-/g, '_');
  shell.mv(
    '.temp-compose-assets/placeholders/' + element,
    '.temp-compose-assets/placeholders/' + xmlName
  );
});

// Generate assets
shell.exec('kotlin src/scripts/assets/generate-compose-source.main.kts');

// Move them to build/icons/compose
shell.cp('-r', 'build/assets/compose', '.temp-compose-assets/generated');
shell.rm('-rf', 'build/assets/compose');
shell.cp(
  '-r',
  '.temp-compose-assets/generated/com/decathlon/vitamin/compose',
  'build/assets/compose'
);

// Clean directory no more necessary
shell.rm('-rf', '.temp-compose-assets');
