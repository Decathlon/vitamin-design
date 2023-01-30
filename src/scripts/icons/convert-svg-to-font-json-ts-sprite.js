const shell = require('shelljs');
const fs = require('fs');

// Icons: Create font
shell.exec('npx fantasticon -c src/config/icons/font/.fantasticonrc.js');

// Icons: Create json
shell.exec('npx fantasticon -c src/config/icons/json/.fantasticonrc.js');

// Icons: Create ts
shell.exec('npx fantasticon -c src/config/icons/ts/.fantasticonrc.js');

// Icons: Create sprite
shell.exec(
  'npx spritesh --viewbox "0 0 16 16" -i build/icons/svg/vitamix -o build/icons/sprite/vitamix.svg'
);
fs.writeFileSync(
  `${process.cwd()}/build/icons/sprite/vitamix.svg.d.ts`,
  'export default SVGElement;'
);

// Icons: json clean
shell.rm('-rf', 'build/icons/json/*.eot');
shell.rm('-rf', 'build/icons/json/*.woff');
shell.rm('-rf', 'build/icons/json/*.woff2');

// Icons: ts clean
shell.rm('-rf', 'build/icons/ts/*.eot');
shell.rm('-rf', 'build/icons/ts/*.woff');
shell.rm('-rf', 'build/icons/ts/*.woff2');
