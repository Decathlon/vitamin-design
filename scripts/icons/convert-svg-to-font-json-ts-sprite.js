const shell = require('shelljs');
const fs = require('fs');

// Icons: Create font
shell.exec('npx fantasticon -c config/icons/font/.fantasticonrc.js');

// Icons: Create json
shell.exec('npx fantasticon -c config/icons/json/.fantasticonrc.js');

// Icons: Create ts
shell.exec('npx fantasticon -c config/icons/ts/.fantasticonrc.js');

// Icons: Create sprite
shell.exec(
  'npx spritesh --viewbox "0 0 16 16" -i icons/svg/all -o icons/sprite/vitamix.svg'
);
fs.writeFileSync(
  `${process.cwd()}/icons/sprite/vitamix.svg.d.ts`,
  'export default SVGElement;'
);

// Icons: json clean
shell.rm('-rf', 'icons/json/*.eot');
shell.rm('-rf', 'icons/json/*.woff');
shell.rm('-rf', 'icons/json/*.woff2');

// Icons: ts clean
shell.rm('-rf', 'icons/ts/*.eot');
shell.rm('-rf', 'icons/ts/*.woff');
shell.rm('-rf', 'icons/ts/*.woff2');
