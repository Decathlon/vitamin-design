module.exports = {
  inputDir: 'build/assets/svg/all',
  outputDir: 'build/assets/ts',
  assetTypes: ['ts'],
  name: 'assets',
  normalize: true,
  formatOptions: {
    ts: {
      types: ['constant', 'literalId'],
      singleQuotes: true,
    },
  },
};
