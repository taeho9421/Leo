<template>
  <div class="header">
      <h1>{{ header_message }}</h1>
  </div>
</template>

<script>
export default {
    data() {
        return {
            header_message : "Hi everyone ! taeho's TodoList !!!"
        }
    }
}
</script>

<style>
.header{
    color: purple;
}
</style>