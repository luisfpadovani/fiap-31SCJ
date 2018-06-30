package br.com.fiap.exepction;

@SuppressWarnings("serial")
public class SaldoInsuficiente extends Exception { 
	public SaldoInsuficiente(String mensagem){
		super(mensagem);
	}

}