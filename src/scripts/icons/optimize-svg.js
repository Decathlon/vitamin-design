const shell = require('shelljs');

// Icons: Optimize `.svg` files
shell.exec(
  'npx svgo --config src/config/icons/svg/svgo.config.js -f build/icons/svg/fill'
);
shell.exec(
  'npx svgo --config src/config/icons/svg/svgo.config.js -f build/icons/svg/line'
);
shell.exec(
  'npx svgo --config src/config/icons/svg/svgo.config.js -f build/icons/svg/vitamix'
);
