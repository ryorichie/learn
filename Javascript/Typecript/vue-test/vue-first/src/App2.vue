<script>
export default {
  data() {
    return {
      name: 'Vue Basics',
      status: 'idle',
      tasks: ["Learn HTML", "Learn CSS", "Learn JS"],
      link: "https://google.com"
    };
  },
  methods: {
    toggleStatus() {
      if (this.status === 'active') {
        this.status = 'idle'
      } else if (this.status === 'idle') {
        this.status = 'inactive'
      } else {
        this.status = 'active'
      }

    }
  }
}

</script>

<template>
  <h1>{{ name }}</h1>
  <p v-if="status === 'active'">User is active</p>
  <p v-else-if="status === 'idle'">User is idle</p>
  <p v-else>User is not active</p>

  <h3>Tasks :</h3>
  <ul>
    <li v-for="task in tasks" :key="task">{{ task }}</li>
  </ul>
  <!-- <a v-bind:href="link">Google</a> -->
  <a :href="link">Google</a>
  <br>

  <!-- <button v-on:click="toggleStatus">Change Status</button> -->
   <button @click="toggleStatus">Change Status</button>
</template>

<style scoped>
h1 {
  color: red;
}
</style>