const express = require('express');
const app = express();
const static = require('serve-static');

app.use('/public',static(__dirname+'/public'));

app.get('/',function(req,res) {
    res.writeHead(200, {'Content-Type':'text/html;charset=UTF8'});
    res.write('<h1>태호의 홈</h1>');
    res.end();
});

app.get('/hobby',function(req,res) {
    res.writeHead(200, {'Content-Type':'text/html;charset=UTF8'});
    res.write('<h1>태호의 취미생활</h1>');
    res.end();
})

app.listen(3000,function() {
    console.log('localhost:3000');
});