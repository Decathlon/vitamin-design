const shell = require('shelljs');

shell.exec(`
  npm run icons:export-svg && 
  npm run icons:optimize-svg && 
  npm run icons:convert-svg-to-font-json-ts-sprite && 
  npm run icons:convert-svg-to-drawable &&
  npm run icons:convert-svg-to-compose &&
  npm run icons:convert-svg-to-pdf`);
