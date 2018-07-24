package br.com.fiap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Exercicio4 { 
	private static ArrayList<Pessoa> arrayList = new ArrayList<>();  
	public static void main(String[] args) {
		carregarPessoas();
 
		//DELETAR ITEM
		Random r = new Random(); 
		arrayList.remove(arrayList.get(r.nextInt(arrayList.size())));		 
		
		//ORDERNAR A -> Z
		Collections.sort(arrayList, new Comparator<Pessoa>(){
			  public int compare(Pessoa p1, Pessoa p2){
			    return p1.nome.compareTo(p2.nome);
			  }
		});
		
		//ORDENAR Z -> A
		Collections.sort(arrayList, new Comparator<Pessoa>(){
			  public int compare(Pessoa p1, Pessoa p2){
			    return p2.nome.compareTo(p1.nome);
			  }
		});
		
		 
		
	} 
	
	private static void carregarPessoas() {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		Pessoa pessoa5 = new Pessoa();

		pessoa1.setNome("Jo�o Garcia");
		pessoa2.setNome("Maria Martins");
		pessoa3.setNome("Henrique Fernando");
		pessoa4.setNome("In�cio Luis");
		pessoa5.setNome("Fernando Ferreira");
		
		pessoa1.setIdade(20);
		pessoa2.setIdade(44);
		pessoa3.setIdade(43);
		pessoa4.setIdade(33);
		pessoa5.setIdade(87);
		
		pessoa1.setSexo('M');
		pessoa2.setSexo('F');
		pessoa3.setSexo('M');
		pessoa4.setSexo('M');
		pessoa5.setSexo('M');
		
		pessoa1.setEmpresa("AIK Enterprises ");
		pessoa2.setEmpresa("Simples");
		pessoa3.setEmpresa("AIK Enterprises ");
		pessoa4.setEmpresa("Magazine Andr�");
		pessoa5.setEmpresa("Casas Recifes");

		arrayList.add(pessoa1);
		arrayList.add(pessoa2);
		arrayList.add(pessoa3);
		arrayList.add(pessoa4);
		arrayList.add(pessoa5);

	}
}
