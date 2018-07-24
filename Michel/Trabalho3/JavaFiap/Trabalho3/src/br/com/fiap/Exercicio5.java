package br.com.fiap;

public class Exercicio5 {

	public static void main(String[] args) { 
		  String mensagem = "AaBbCcDdEeFfGgHhIiJj";
		  StringBuilder cripto = Cripto(mensagem);
		  System.out.println(cripto);
		  System.out.println(Descripto(cripto.toString()));
		  
	}
	
	public static StringBuilder Cripto(String mensagem) {		 
		 StringBuilder cripto = new StringBuilder();		 
		 for(int j =0; j <= mensagem.length()-1 ;j++){  
			cripto.append((char)((int)mensagem.charAt(j) + 1));
		  } 		
		  return cripto; 
	}
	
	public static StringBuilder Descripto(String mensagem) {		 
		 StringBuilder descripto = new StringBuilder();		 
		 for(int j =0; j <= mensagem.length()-1 ;j++){  
			 descripto.append((char)((int)mensagem.charAt(j) - 1));
		  } 		
		  return descripto ; 
	}

}
