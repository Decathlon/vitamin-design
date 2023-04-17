const shell = require('shelljs');

// Assets: Optimize `.svg` files
shell.exec(
  'npx svgo --config src/config/assets/svg/svgo.config.js -f build/assets/svg/flags'
);
shell.exec(
  'npx svgo --config src/config/assets/svg/svgo.config.js -f build/assets/svg/logos'
);
shell.exec(
  'npx svgo --config src/config/assets/svg/svgo.config.js -f build/assets/svg/payments'
);
shell.exec(
  'npx svgo --config src/config/assets/svg/svgo.config.js -f build/assets/svg/placeholders'
);
shell.exec(
  'npx svgo --config src/config/assets/svg/svgo.config.js -f build/assets/svg/shipping'
);
shell.exec(
  'npx svgo --config src/config/assets/svg/svgo.config.js -f build/assets/svg/all'
);
