package br.com.fiap;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio5 {

	public static void main(String[] args) throws IOException { 
		  String mensagem = "AaBbCcDdEeFfGgHhIiJj";
		  StringBuilder cripto = Cripto("C:\\mensagemCodificada.txt",mensagem);
		  System.out.println(cripto);
		  System.out.println(Descripto("C:\\mesagemDecodificada.txt",cripto.toString())); 
	}
	
	public static StringBuilder Cripto(String path,String mensagem) throws IOException {		 
		 StringBuilder cripto = new StringBuilder();		 
		 for(int j =0; j <= mensagem.length()-1 ;j++){  
			cripto.append((char)((int)mensagem.charAt(j) + 1));
		  } 		
		  GravarArquivo(path, cripto);
		 
		  return cripto; 
	}
	
	public static StringBuilder Descripto(String path,String mensagem) throws IOException {		 
		 StringBuilder descripto = new StringBuilder();		 
		 for(int j =0; j <= mensagem.length()-1 ;j++){  
			 descripto.append((char)((int)mensagem.charAt(j) - 1));
		  } 		
		 GravarArquivo(path, descripto);
		  return descripto ; 
	}
	
	public static void GravarArquivo(String path, StringBuilder texto) throws IOException {
		FileWriter arq = new FileWriter(path);
	    PrintWriter gravarArq = new PrintWriter(arq); 
	    gravarArq.printf(texto.toString()); 
	    arq.close();
	}
}
