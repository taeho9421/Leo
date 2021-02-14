<template>
  <div class="inputbox">
    <input type="text" v-model="newTodoItem" v-on:keyup.enter="addTodoItem">
    <button v-on:click="addTodoItem">추가하기</button>
  </div>
</template>

<script>
export default {
    data() {
        return {
            newTodoItem: ""
        }
    },
    methods: {
        addTodoItem(){
            if(this.newTodoItem !== "") {
                var value = this.newTodoItem && this.newTodoItem.trim();
                this.$emit('addTodo',value);
                this.clearInputbox();
            }
        },
        clearInputbox() {
            this.newTodoItem= ""; 
        }
    }
}
</script>

<style>

</style>