<template>
  <div>
      <button v-on:click="clearAll">전체삭제</button>
      <br>
      {{copyright}}
  </div>
</template>

<script>
export default {
    data() {
        return {
            copyright: "copyright with taeho "
        }
    },
    methods: {
        clearAll() {
            this.$emit('clearAll');
        }
    }
}
</script>

<style>

</style>