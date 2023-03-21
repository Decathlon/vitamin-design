module.exports = {
  inputDir: 'build/assets/svg/all',
  outputDir: 'build/assets/json',
  assetTypes: ['json'],
  name: 'assets',
  normalize: true,
  formatOptions: {
    json: {
      indent: 2,
    },
  },
};
