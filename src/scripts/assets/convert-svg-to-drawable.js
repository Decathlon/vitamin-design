const fs = require('fs');
const shell = require('shelljs');
const svg2vectordrawable = require('svg2vectordrawable/src/svg-file-to-vectordrawable-file');

let options = {};

shell.ls('build/assets/svg/all').forEach((file) => {
  fs.writeFileSync(
    `build/assets/svg/all/${file}`,
    shell.sed('-i', /white/g, '#FFFFFF', `build/assets/svg/all/${file}`).stdout
  );
});

shell.ls('build/assets/svg/flags').forEach((file) => {
  fs.writeFileSync(
    `build/assets/svg/flags/${file}`,
    shell.sed('-i', /white/g, '#FFFFFF', `build/assets/svg/flags/${file}`)
      .stdout
  );

  svg2vectordrawable.convertFile(
    `build/assets/svg/flags/${file}`,
    `build/assets/drawable/vtmn_${file.split('.')[0].replaceAll('-', '_')}.xml`,
    options
  );
});

shell.ls('build/assets/svg/payments').forEach((file) => {
  fs.writeFileSync(
    `build/assets/svg/payments/${file}`,
    shell.sed('-i', /white/g, '#FFFFFF', `build/assets/svg/payments/${file}`)
      .stdout
  );

  svg2vectordrawable.convertFile(
    `build/assets/svg/payments/${file}`,
    `build/assets/drawable/vtmn_payment_${file
      .split('.')[0]
      .replaceAll('-', '_')}.xml`,
    options
  );
});
