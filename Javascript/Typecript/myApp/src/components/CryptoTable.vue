<template>
    <ion-content>
      <ion-card>
        <ion-card-header>
          <ion-card-title style="text-align: center;">Crypto Data</ion-card-title>
        </ion-card-header>
        
        <ion-card-content>
          <ion-grid>
            <ion-row >
              <ion-col style="text-align: center; flex: 0 0 6%">
                Rank
              </ion-col>
              <ion-col style="flex: 0 0 46%">
                Name
              </ion-col>
              <ion-col style="flex: 0 0 46%">
                Price
              </ion-col>
            </ion-row>
            
            <ion-row v-if="loading">
              <ion-col colspan="3">
                <ion-spinner></ion-spinner> Loading...
              </ion-col>
            </ion-row>
            
            <ion-row v-else v-for="crypto in cryptoData" :key="crypto.symbol">
              <ion-col style="text-align: center; flex: 0 0 6%">
                <div>Rank</div>
                <div>{{ crypto.rank }}</div>
              </ion-col>
              <ion-col style="flex: 0 0 46%">
                <div>{{ crypto.name }}</div>
                <di style="font-size: large;">{{ crypto.symbol }}</di>
              </ion-col>
              <ion-col style="flex: 0 0 46%">
                <div>USD</div>
                <div>${{ Number(crypto.price_usd).toFixed(2) }}</div>
              </ion-col>
            </ion-row>
          </ion-grid>
  
          <ion-button expand="block" @click="refreshData" :disabled="loading">
            <ion-icon :icon="refreshOutline" slot="start"></ion-icon>
            Refresh
          </ion-button>
        </ion-card-content>
      </ion-card>
    </ion-content>
  </template>
  
  <script>
  import { IonButton, IonIcon, IonSpinner } from '@ionic/vue';
  import { refreshOutline } from 'ionicons/icons';
  
  export default {
    components: {
      IonButton,
      IonIcon,
      IonSpinner
    },
    data() {
      return {
        cryptoData: [],
        loading: false,
        refreshOutline
      }
    },
    methods: {
      async fetchData() {
        this.loading = true;
        try {
          const response = await fetch('https://api.coinlore.net/api/tickers/');
          const data = await response.json();
          
          // Get the top 20 cryptocurrencies
          this.cryptoData = data.data.slice(0, 20);
        } catch (error) {
          console.error('Error fetching crypto data:', error);
          // You might want to show an error message to the user
        } finally {
          this.loading = false;
        }
      },
      async refreshData() {
        await this.fetchData();
      }
    },
    async created() {
      await this.fetchData();
    }
  }
  </script>
  
  <style scoped>
  ion-grid {
    padding: 0;
    margin-bottom: 20px;
  }
  
  ion-col {
    padding: 10px;
    border-bottom: 1px solid #eee;
  }
  
  ion-row:first-child ion-col {
    font-weight: bold;
  }
  
  ion-button {
    margin-top: 16px;
  }
  
  ion-spinner {
    margin-right: 10px;
  }
  </style>