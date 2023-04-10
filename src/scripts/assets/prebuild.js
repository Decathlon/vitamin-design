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

// Assets: Create drawable directory
shell.mkdir('-p', 'build/assets/drawable');

// Assets: Create compose directory
shell.mkdir('-p', 'build/assets/compose');

// Assets: Create ios directories
shell.mkdir('-p', 'build/assets/ios/Sources/VitaminCore/Foundations/Assets');
shell.mkdir(
  '-p',
  'build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets'
);
shell.mkdir(
  '-p',
  'build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/flag'
);
shell.mkdir(
  '-p',
  'build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/logo'
);
shell.mkdir(
  '-p',
  'build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/payment'
);
shell.mkdir(
  '-p',
  'build/assets/ios/Sources/VitaminCore/Foundations/Assets/VitaminAssets.xcassets/placeholder'
);
shell.mkdir(
  '-p',
  'build/assets/ios/Showcase/Application/Core/Foundations/Assets'
);
