const shell = require('shelljs');

shell.exec(`
  npm run assets:export-svg && 
  npm run assets:optimize-svg &&
  npm run assets:convert-svg-to-json-ts-sprite &&
  npm run assets:convert-svg-to-drawable`);
