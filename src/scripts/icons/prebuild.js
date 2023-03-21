const shell = require('shelljs');

// Delete `build/icons` folder
shell.rm('-rf', 'build/icons');

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
