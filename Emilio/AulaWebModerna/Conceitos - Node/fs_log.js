var fileIndex = 'D:/git/Padovani/fiap_31SCJ/Emilio/AulaWebModerna/Conceitos - HTML/index.html'

var fs = require('fs');
   
    fs.readFile(fileIndex, function (erro, arquivo) {
        if (erro) throw erro;
            console.log(arquivo);
    });

var arquivo = fs.readFileSync(fileIndex);

console.log(arquivo);  