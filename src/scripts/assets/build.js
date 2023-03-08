const shell = require('shelljs');

shell.exec(`
  npm run assets:export-svg && 
  npm run assets:optimize-svg`);
