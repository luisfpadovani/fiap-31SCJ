package br.com.fiap.trabalho1;
import javax.swing.JOptionPane;
public class Calculadora {
	static double valorFinal;
	public static void main(String[] args) {
		while (true) {
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fazer outra opera��o?", null,
					JOptionPane.YES_NO_OPTION);
			if (resposta == JOptionPane.NO_OPTION) {
				break;
			}
			String opcao = (String) JOptionPane.showInputDialog(null, "Selecione uma opera��o", "Eventos",
					JOptionPane.DEFAULT_OPTION, null, new String[] { "SOMA", "SUBTRA��O", "MULTIPLICA��O", "DIVIS�O" },
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
				case "SUBTRA��O":
					subtracao(valor);
					break;
				case "MULTIPLICA��O":
					multiplicacao(valor);
					break;
				case "DIVIS�O":
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
