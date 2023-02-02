const fs = require('fs');
const shell = require('shelljs');
const svg2vectordrawable = require('svg2vectordrawable/src/svg-file-to-vectordrawable-file');

let options = {
  fillBlack: true,
  tint: '#FFFFFFFF',
};

let promises = [];

shell.ls('build/icons/svg/all').forEach((file) => {
  promises.push(
    svg2vectordrawable.convertFile(
      `build/icons/svg/all/${file}`,
      `build/icons/drawable/ic_vtmn_${file
        .split('.')[0]
        .replaceAll('-', '_')}.xml`,
      options
    )
  );
});

Promise.all(promises).then(() => {
  shell.ls('build/icons/drawable/*.xml').forEach(function (file) {
    fs.writeFileSync(
      file,
      shell.sed(
        '-i',
        'viewportHeight="24">',
        'viewportHeight="24"\n    android:tint="?attr/colorControlNormal">',
        file
      ).stdout
    );

    if (file.endsWith('_fill.xml')) {
      const filePath = `${file.split('_fill.xml')[0]}.xml`;
      const iconName = file.split('_fill.xml')[0].split('/').slice(-1)[0];

      fs.writeFileSync(
        filePath,
        `<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@drawable/${iconName}_fill" android:state_checked="true"/>
    <item android:drawable="@drawable/${iconName}_line" android:state_checked="false"/>
</selector>`
      );
    }
  });
});
