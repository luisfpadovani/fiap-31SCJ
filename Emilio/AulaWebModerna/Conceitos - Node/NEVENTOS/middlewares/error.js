exports.notFound = function (request, response, next) {
    response.status(404);
    response.render('error/Erro404');
};

exports.serverError = function (error, request, response, next) {
    response.status(500);
    response.render('error/ErroInterno505', { error: error });
};
