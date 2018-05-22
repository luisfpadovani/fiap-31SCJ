package br.com.fiap.trabalho1;
import javax.swing.JOptionPane; 
public class Fatorial {
	public static void main(String[] args) {
		String valorString = JOptionPane.showInputDialog("Digite o valor de calcular o fatorial");
		int valorFatorial = Integer.parseInt(valorString.trim());
		int fatorial = 1;
		for (int i = 1; i <= valorFatorial;i++) {
			fatorial = fatorial * i; 
		}
		System.out.println(fatorial);
	}
}
