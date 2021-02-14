<template>
  <div id="app">
    <Header/>
    <List v-bind:propsdata="todoItems" v-on:deleteTodoItem="deleteTodoItem"/>
    <Input v-on:addTodo="addTodo"/>
    <Footer v-on:clearAll="clearAll"/>
  </div>
</template>

<script>
import Header from './components/Header.vue'
import List from './components/List.vue'
import Input from './components/Input.vue'
import Footer from './components/Footer.vue'

export default {
  name: 'App',
  components: {
    Header,
    List,
    Input,
    Footer
  },
  data() {
    return {
      todoItems: []
    }
  },
  methods: {
    addTodo(todoItem) {
      localStorage.setItem(todoItem,todoItem)
      this.todoItems.push(todoItem)
    },
    clearAll(){
      localStorage.clear();
      this.todoItems = [];
    },
    deleteTodoItem(todoItem,index) {
      localStorage.removeItem(todoItem);
      this.todoItems.splice(index,1);
    }
  },
  created() {
        if(localStorage.length>0) {
            for(var i=0;i<localStorage.length;i++) {
                this.todoItems.push(localStorage.key(i))
            }
        }
    }
}
</script>

<style>

</style>
