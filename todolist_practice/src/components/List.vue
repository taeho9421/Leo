<template>
  <section class="list">
    <ul>
        <li v-for="(todoItem,index) in propsdata" :key="todoItem">
            {{ todoItem }}
        <button v-on:click="deleteTodoItem(todoItem,index)">삭제하기</button>
        </li>
    </ul>
  </section>
</template>

<script>
export default {
    props:['propsdata'],
    methods:{
        deleteTodoItem(todoItem,index) {
            this.$emit('deleteTodoItem',todoItem,index);
        }
    }
}
</script>

<style>

</style>