<script setup>
import Hero from '@/components/Hero.vue';
import HomeCards from '@/components/HomeCards.vue';
import JobListings from '@/components/JobListings.vue';
</script>

<template>
    <Hero title="Become a Vue Ninja" subtitle="This might be silly but bear with me" />
    <HomeCards />
    <JobListings limit="3" :showButton="true" />
</template>