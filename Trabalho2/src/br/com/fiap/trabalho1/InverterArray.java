package br.com.fiap.trabalho1; 
public class InverterArray {
	public static void main(String[] args) { 
		
		int[] meuVetor = { 1, 2, 3}; 
		int[] vetorInvertido = new int[meuVetor.length];
		for(int i = 0; i < meuVetor.length; i++) {
			vetorInvertido[i] = meuVetor[( meuVetor.length - 1) - i];		    
		}
		for(int i = 0; i < vetorInvertido.length; i++) {
			System.out.print(vetorInvertido[i]);		    
		}
	} 
}
