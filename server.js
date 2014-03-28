var lib = require('./lib');
var http = require('http');
var cluster = require('cluster');
var os = require('os');

function requestHandler (req, res) {
  res.writeHead(200, {'Content-Type': 'text/plain'});
  lib.fizzBuzz(res, function () {
    res.end();
  });
}

if (cluster.isMaster) {
  var cpus = os.cpus().length;
  for (var i = 0; i < cpus; i++) {
    cluster.fork();
  }

  cluster.on('exit', function (worker, code, signal) {
    console.log('worker ' + worker.process.pid + ' died');
  });
} else {
  http.createServer(requestHandler).listen(1337, '127.0.0.1');
}
