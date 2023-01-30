const shell = require('shelljs');

shell.cp('-r', 'build/icons/font/*', 'build/icons/vitamix/font');
shell.cp('-r', 'build/icons/json/*', 'build/icons/vitamix/font');
shell.cp('-r', 'build/icons/ts/*', 'build/icons/vitamix/font');
shell.cp('-r', 'build/icons/sprite/*', 'build/icons/vitamix/sprite');
shell.cp('-r', 'build/icons/svg/all/*', 'build/icons/vitamix/svg');
