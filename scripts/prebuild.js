const shell = require('shelljs');

// Delete `icons` folder
shell.rm('-rf', 'icons');

// Icons: Create SVG directories
shell.mkdir('-p', 'icons/svg/fill');
shell.mkdir('-p', 'icons/svg/line');
shell.mkdir('-p', 'icons/svg/all');

// Icons: Create font directory
shell.mkdir('-p', 'icons/font');

// Icons: Create json directory
shell.mkdir('-p', 'icons/json');

// Icons: Create ts directory
shell.mkdir('-p', 'icons/ts');

// Icons: Create sprite directory
shell.mkdir('-p', 'icons/sprite');

// Icons: Create vector drawable directory
shell.mkdir('-p', 'icons/vector-drawable');

// Icons: Create compose directory
shell.mkdir('-p', 'icons/compose');

// Icons: Create pdf directory
shell.mkdir('-p', 'icons/pdf');
