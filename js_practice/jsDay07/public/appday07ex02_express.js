// day07ex02_express.js
// app.js == main.js 

// express module 불러오기 (가져오기)
let express = require('express'); 

// 서버 객체 생성하기
let app = express();

// 요청 이벤트 리스너 준비 
// 요청 : request , 응답 : response 
// 미들웨어 설정방식으로 요청 이벤트 리스너 구현. 
app.use(function(request,response) {
    console.log('요청 들어옴.');
    response.write("<html><body>")
    response.write('<h1>Hello Nodejs World!</h1>');
    response.write('<table border="1">');
    response.write('<tr><td>name</td><td>KIM</td></tr>');
    response.write("</table");
    response.write("</body></html>");
    response.end(); 
}); 

// 실행할땐 listen(portNumber,callback())
app.listen(3000,function() {
    console.log('127.0.0.1:3000 서버실행됨.');
});


