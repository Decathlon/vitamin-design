const shell = require('shelljs');

// Delete `icons` folder
shell.rm('-rf', 'build');

// Icons: Create SVG directories
shell.mkdir('-p', 'build/icons/svg/fill');
shell.mkdir('-p', 'build/icons/svg/line');
shell.mkdir('-p', 'build/icons/svg/all');

// Icons: Create font directory
shell.mkdir('-p', 'build/icons/font');

// Icons: Create json directory
shell.mkdir('-p', 'build/icons/json');

// Icons: Create ts directory
shell.mkdir('-p', 'build/icons/ts');

// Icons: Create sprite directory
shell.mkdir('-p', 'build/icons/sprite');

// Icons: Create vector drawable directory
shell.mkdir('-p', 'build/icons/drawable');

// Icons: Create compose directory
shell.mkdir('-p', 'build/icons/compose');

// Icons: Create pdf directory
shell.mkdir('-p', 'build/icons/pdf');
