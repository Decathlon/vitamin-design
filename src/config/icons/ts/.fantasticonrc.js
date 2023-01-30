module.exports = {
  inputDir: 'build/icons/svg/all',
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
