// Scaffold copy/pasta'd from http://blog.modulus.io/build-your-first-http-server-in-nodejs
//Lets require/import the HTTP module
var http = require('http');

//Lets define a port we want to listen to
const PORT=8000;

var dataRead = '';
var filepath = './';

//We need a function which handles requests and send response
function handleRequest(req, res){
  console.log('Got request');
  console.log('url: ' + req.url);
  // Code from $ammy
  if (req.url == '/') {
    console.log('Hit root');
  } else if (req.url == '/56741123857') {
    console.log('headers: ');
    console.log(req.headers);

    if(req.headers['content-length'] <= 5 &&
    req.headers['content-length'] >0) {
      console.log('content-length within requirements');
    } else {
      console.log('content-length NOT within requirements');
    }
  }
}

//Create a server
var server = http.createServer(handleRequest);

//Lets start our server
server.listen(PORT, function(){
    //Callback triggered when server is successfully listening. Hurray!
    console.log("Server listening on: http://localhost:%s", PORT);
});
