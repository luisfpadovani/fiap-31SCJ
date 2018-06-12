package br.com.fiap;

import javax.jws.WebService;

@WebService(name = "Fiap31scfSEI", targetNamespace = "http://fiap.com.br/")
public interface Fiap31scfSEI {

	String WhatisTheAnswer(String interview);

}