const shell = require('shelljs');

// Create temp directory for svg icons with the good name
shell.mkdir('-p', '.temp-compose-icons/fill');
shell.mkdir('-p', '.temp-compose-icons/line');

// Copy all icons from svg folders to temp folder
shell.cp('-r', 'build/icons/svg/fill/*.svg', '.temp-compose-icons/fill');
shell.cp('-r', 'build/icons/svg/line/*.svg', '.temp-compose-icons/line');

// Rename name of icons
const fills = shell.ls('.temp-compose-icons/fill');
fills.forEach((element) => {
  const xmlName = element.replace(/(-fill)(?!.*\1)/, '').replace(/-/g,'_');
  shell.mv(
    '.temp-compose-icons/fill/' + element,
    '.temp-compose-icons/fill/' + xmlName
  );
});

const lines = shell.ls('.temp-compose-icons/line');
lines.forEach((element) => {
  const xmlName = element.replace(/(-line)(?!.*\1)/, '').replace(/-/g,'_');
  shell.mv(
    '.temp-compose-icons/line/' + element,
    '.temp-compose-icons/line/' + xmlName
  );
});

// Generate icons
shell.exec('kotlin src/scripts/icons/generate-compose-source.main.kts');

// Clean directory no more necessary
shell.rm('-rf', '.temp-compose-icons');
