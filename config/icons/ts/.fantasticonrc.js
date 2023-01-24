module.exports = {
  inputDir: 'icons/svg/all',
  outputDir: './icons/ts',
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
