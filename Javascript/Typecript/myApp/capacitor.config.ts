import { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'com.cryptoprices.app',
  appName: 'Crypto Prices',
  webDir: 'dist',
  server: {
    androidScheme: 'https'
  },
  style: {
    androidStatusBarColor: '#3880ff'
  }
};

export default config;