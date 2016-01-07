var http = require('http');

const PORT = 8000;


// client request
var options = {
  port: PORT,
  hostname: '127.0.0.1',
  method: 'GET',
  path: '/',
  headers: {
      'content-length': 5
  }
};

function requestCallback(response) {
  response.on('end', function() {
    console.log("Request ended")
    console.log(response.body);
  });
}

console.log('Making root request');
var req = http.get(options, requestCallback).end();
console.log('Made root request');



// client request
var options = {
  port: PORT,
  hostname: '127.0.0.1',
  method: 'GET',
  path: '/56741123857',
  headers: {
      'content-length': 5
  }
};

function requestCallback(response) {
  response.on('end', function() {
    console.log("Request ended")
  });
}

console.log('Making numbered request');
var req = http.get(options, requestCallback).end();
console.log('Made numbered request');
