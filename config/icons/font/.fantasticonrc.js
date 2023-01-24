module.exports = {
  inputDir: 'icons/svg/all',
  outputDir: './icons/font',
  fontTypes: ['ttf', 'woff', 'woff2'],
  assetTypes: ['css', 'html'],
  name: 'vitamix',
  prefix: 'vtmx',
  normalize: true,
  templates: {
    css: 'config/icons/font/css.hbs',
  },
};
