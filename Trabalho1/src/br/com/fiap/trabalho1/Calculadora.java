package br.com.fiap.trabalho1;
import javax.swing.JOptionPane;
public class Calculadora {
	static double valorFinal;
	public static void main(String[] args) {
		while (true) {
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fazer outra operação?", null,
					JOptionPane.YES_NO_OPTION);
			if (resposta == JOptionPane.NO_OPTION) {
				break;
			}
			String opcao = (String) JOptionPane.showInputDialog(null, "Selecione uma operação", "Eventos",
					JOptionPane.DEFAULT_OPTION, null, new String[] { "SOMA", "SUBTRAÇÃO", "MULTIPLICAÇÃO", "DIVISÃO" },
					null); 	
			if (opcao != null) {
				String valorString = JOptionPane.showInputDialog("Digite o valor da calculadora");
				double valor = 0;
				if (valorString == null) {
					valor = 0;
				} else {
					valor = Double.parseDouble(valorString.trim());
				}				
				switch (opcao) {
				case "SOMA":
					soma(valor);
					break;
				case "SUBTRAÇÃO":
					subtracao(valor);
					break;
				case "MULTIPLICAÇÃO":
					multiplicacao(valor);
					break;
				case "DIVISÃO":
					divisao(valor);
					break;
				}
			}
		} 
		System.out.println(valorFinal);
	}
	private static void soma(double valor) {
		valorFinal = valorFinal + valor;
	}
	private static void subtracao(double valor) {
		valorFinal = valorFinal - valor;
	}
	private static void divisao(double valor) {
		valorFinal = valorFinal / valor;
	}
	private static void multiplicacao(double valor) {
		valorFinal = valorFinal * valor;
	}
}
