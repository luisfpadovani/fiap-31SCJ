package br.com.fiap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://fiap.com.br/", endpointInterface = "br.com.fiap.Fiap31scfSEI", portName = "Fiap31scfPort", serviceName = "Fiap31scfService")
public class Fiap31scf implements Fiap31scfSEI {
	public String WhatisTheAnswer(String interview) {
		return "lol" + interview;
	}
}
