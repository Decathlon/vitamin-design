const shell = require('shelljs');
const fs = require('fs');

// Assets: Create json
shell.exec('npx fantasticon -c src/config/assets/json/.fantasticonrc.js');

// Assets: Create ts
shell.exec('npx fantasticon -c src/config/assets/ts/.fantasticonrc.js');

// Assets: Create sprite
shell.exec(
  'npx spritesh --viewbox "0 0 16 16" -i build/assets/svg/all -o build/assets/sprite/assets.svg'
);
fs.writeFileSync(
  `${process.cwd()}/build/assets/sprite/assets.svg.d.ts`,
  'export default SVGElement;'
);

// Assets: json clean
shell.rm('-rf', 'build/assets/json/*.eot');
shell.rm('-rf', 'build/assets/json/*.woff');
shell.rm('-rf', 'build/assets/json/*.woff2');

// Assets: ts clean
shell.rm('-rf', 'build/assets/ts/*.eot');
shell.rm('-rf', 'build/assets/ts/*.woff');
shell.rm('-rf', 'build/assets/ts/*.woff2');
