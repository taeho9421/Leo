const http = require('http');
const express = require('express');
const app = express();
const router = express.Router();
const bodyParser = require('body-parser');
const static = require('serve-static');
const path = require('path');

app.set('port', 3000);

app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());
app.use('/bit', static(path.join(__dirname, 'public')));

router.route('/data').get( (req,res) => {
    let user = req.query.user;
    let message = req.query.msg;
    
    res.writeHead(200, {"Content-Type":"text/html; charset=UTF-8"});
    res.write(`USER:${user},MESSAGE:${message}`);
    res.end();
});

router.route('/data2').get( (req,res) => {
    let user = req.query.user;
    let message = req.query.msg;
    
    let jsonData = {
        "user":user,
        "message":message
    };

   // res.send(jsonData);
   res.end(JSON.stringify(jsonData));
});

router.route('/calc/plus/:a/:b').get((req,res)=> {
    let a = parseInt(req.params.a);
    let b = parseInt(req.params.b);

    res.end(a + b+"");
});

router.route('/calc/minus/:a/:b').get((req,res)=> {
    let a = parseInt(req.params.a);
    let b = parseInt(req.params.b);

    res.end(a - b+"");
});

app.use('/', router);
const server = http.createServer(app);
server.listen(app.get('port'), ()=> {
    console.log(`http://localhost:${app.get('port')}`);
});