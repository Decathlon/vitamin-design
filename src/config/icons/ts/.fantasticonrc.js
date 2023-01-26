module.exports = {
  inputDir: 'build/icons/svg/vitamix',
  outputDir: 'build/icons/ts',
  assetTypes: ['ts'],
  name: 'vitamix',
  normalize: true,
  formatOptions: {
    ts: {
      types: ['constant', 'literalId'],
      singleQuotes: true,
    },
  },
};
