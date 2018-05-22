package br.com.fiap.trabalho2.calculadora;

import javax.swing.JOptionPane;

public class ExecutarCalculadora {

	public static void main(String[] args) throws Exception{

		try {
			while(true) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fazer outra operação?", null,
						JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.NO_OPTION) {
					break;
				} 
				
				CalculadoraBasica calc = new CalculadoraClassica();
				String valorString1 = JOptionPane.showInputDialog("Digite o primeiro valor");
				float valor1 = 0;
				if (valorString1 == null) {
					valor1 = 0;
				} else {
					valor1 = Float.parseFloat(valorString1.trim());
				}

				String valorString2 = JOptionPane.showInputDialog("Digite o segundo valor");
				float valor2 = 0;
				if (valorString2 == null) {
					valor2 = 0;
				} else {
					valor2 = Float.parseFloat(valorString2.trim());
				}

				System.out.println("SOMA: " + calc.somar(valor1, valor2));
				System.out.println("SUBTRAÇÃO: " + calc.subtrair(valor1, valor2));
				System.out.println("DIVISÃO: " + calc.dividir(valor1, valor2));
				System.out.println("MULTIPLICAÇÃO: " + calc.multiplicar(valor1, valor2));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
