const shell = require('shelljs');

// Icons: Optimize `.svg` files
shell.exec(
  'npx svgo --config config/icons/svg/svgo.config.js -f icons/svg/fill'
);
shell.exec(
  'npx svgo --config config/icons/svg/svgo.config.js -f icons/svg/line'
);
shell.exec(
  'npx svgo --config config/icons/svg/svgo.config.js -f icons/svg/all'
);
