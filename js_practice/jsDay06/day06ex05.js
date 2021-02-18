(function() {
    console.log(this);
})();

console.log("-------------");

(()=>{
    console.log(this);
})();