var fileIndex = 'D:/git/Padovani/fiap_31SCJ/Emilio/AulaWebModerna/Conceitos - HTML/index.html'

var http = require('http');
var fs = require('fs');
    var server = http.createServer(function (request, response) {
    // A constante __dirname retorna o diretório raiz da
    // aplicação.
        fs.readFile(fileIndex, function (erro, html) {
            response.writeHeader(200, { 'Content-Type': 'text/html' });
            response.write(html);
            response.end();
        });
    });
    server.listen(3000, function () {
        console.log('Executando Site Pessoal');
    });