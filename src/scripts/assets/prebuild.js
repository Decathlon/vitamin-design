const shell = require('shelljs');

// Delete `build/assets` folder
shell.rm('-rf', 'build/assets');

// Assets: Create SVG directories
shell.mkdir('-p', 'build/assets/svg/flags');
shell.mkdir('-p', 'build/assets/svg/logos');
shell.mkdir('-p', 'build/assets/svg/payments');
shell.mkdir('-p', 'build/assets/svg/placeholders');
shell.mkdir('-p', 'build/assets/svg/all');

// Assets: Create json directory
shell.mkdir('-p', 'build/assets/json');

// Assets: Create ts directory
shell.mkdir('-p', 'build/assets/ts');

// Assets: Create sprite directory
shell.mkdir('-p', 'build/assets/sprite');

// Assets: Create vector drawable directory
shell.mkdir('-p', 'build/assets/vector-drawable');

// Assets: Create compose directory
shell.mkdir('-p', 'build/assets/compose');

// Assets: Create ios directories
shell.mkdir('-p', 'build/assets/ios/Sources/VitaminCore/Foundations/Assets');
shell.mkdir(
  '-p',
  'build/assets/ios/Sources/VitaminCore/Foundations/Assets/Vitamix.xcassets'
);
shell.mkdir('-p', 'build/assets/ios/Sources/VitaminSwiftUI/Foundations/Assets');
shell.mkdir('-p', 'build/assets/ios/Sources/VitaminUIKit/Foundations/Assets');
