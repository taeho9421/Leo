// app.js == main.js 

const express = require('express'); 
const static = require('serve-static'); // npm install serve-static -S 

const app = express();

// serv-static 미들웨어 설정
app.use('/public', static(__dirname + '/public')); // use(path,static)

app.get('/',function(req,res) {
    res.writeHead(200, {'Content-Type':'text/html;charset=UTF8'});
    res.write('<h1>범준쌤 코딩교실 - 홈</h1>');
    res.end(); // 안적어주면 무한루프 
})

app.get('/profile',function(req,res) {
    res.writeHead(200, {'Content-Type':'text/html;charset=UTF8'});
    res.write('범준쌤 약력'); 
    res.end(); // 안적어주면 무한루프 
})

app.listen(3000,function() {
    console.log('127.0.0.1:3000 서버실행됨.');
});


