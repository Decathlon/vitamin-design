module.exports = {
  inputDir: 'build/icons/svg/all',
  outputDir: 'build/icons/font',
  fontTypes: ['ttf', 'woff', 'woff2'],
  assetTypes: ['css', 'html'],
  name: 'vitamix',
  prefix: 'vtmx',
  normalize: true,
  templates: {
    css: 'src/config/icons/font/css.hbs',
  },
};
