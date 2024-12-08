<script setup>
import { RouterLink } from 'vue-router';
</script>

<template>
    <section class="text-center flex flex-col justify-center items-center h-96">
        <i class="pi pi-exclamation-triangle text-yellow-500 text-7xl mb-5"></i>
        <h1 class="text-6xl font-bold mb-4">404 Not Found</h1>
        <p class="text-xl mb-6">The page you are looking for does not exist</p>
        <RouterLink to="/" class="text-white bg-green-600 hover:bg-green-700 px-4 py-2 rounded">Go Back
        </RouterLink>
    </section>
</template>