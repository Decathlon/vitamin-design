const shell = require('shelljs');

// Icons: Create a temp folder to store all svgs
shell.mkdir('-p', '.temp-svg-icons/all');
shell.cp('-r', 'build/icons/svg/all/*.svg', '.temp-svg-icons/all');

// Delete some `build/icons` folders
shell.rm('-rf', 'build/icons/svg');
shell.rm('-rf', 'build/icons/font');
shell.rm('-rf', 'build/icons/json');
shell.rm('-rf', 'build/icons/ts');
shell.rm('-rf', 'build/icons/sprite');
shell.rm('-rf', 'build/icons/drawable');
shell.rm('-rf', 'build/icons/compose');
shell.rm('-rf', 'build/icons/ios');
shell.rm('-rf', 'build/icons/vitamix');

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

// Icons: Create drawable directory
shell.mkdir('-p', 'build/icons/drawable');

// Icons: Create compose directory
shell.mkdir('-p', 'build/icons/compose');

// Icons: Create ios directories
shell.mkdir('-p', 'build/icons/ios/Sources/VitaminCore/Foundations/Icons');
shell.mkdir(
  '-p',
  'build/icons/ios/Sources/VitaminCore/Foundations/Icons/Vitamix.xcassets'
);
shell.mkdir('-p', 'build/icons/ios/Sources/VitaminSwiftUI/Foundations/Icons');
shell.mkdir('-p', 'build/icons/ios/Sources/VitaminUIKit/Foundations/Icons');
shell.mkdir(
  '-p',
  'build/icons/ios/Showcase/Application/Core/Foundations/Icons'
);

// Icons: Create vitamix directories
shell.mkdir('-p', 'build/icons/vitamix/font');
shell.mkdir('-p', 'build/icons/vitamix/sprite');
shell.mkdir('-p', 'build/icons/vitamix/svg');
