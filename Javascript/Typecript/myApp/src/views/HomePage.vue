<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>Crypto Prices</ion-title>
      </ion-toolbar>
    </ion-header>
    
    <CryptoTable />
  </ion-page>
</template>

<script>
import { IonPage, IonHeader, IonToolbar, IonTitle } from '@ionic/vue';
import CryptoTable from '@/components/CryptoTable.vue';

export default {
  components: {
    IonPage,
    IonHeader,
    IonToolbar,
    IonTitle,
    CryptoTable
  }
}
</script>