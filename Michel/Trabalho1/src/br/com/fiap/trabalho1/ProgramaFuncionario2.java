package br.com.fiap.trabalho1;

import javax.swing.JOptionPane;

public class ProgramaFuncionario2 {

	public static void main(String[] args) {
		String quantidadeArrayString  = JOptionPane.showInputDialog("Digite a quantidade de funcionarios da sua empresa:");	
		int quantidadeArrayInt = Integer.parseInt(quantidadeArrayString);
		
		
		double[] salario = new double[quantidadeArrayInt];
		double salarioTotal = 0;
		
		for(int i = 0; i < quantidadeArrayInt; i++) {
			String salarioString  = JOptionPane.showInputDialog("Digite o salario do "+(i+1)+" funcionario");	
			salario[i] = Double.parseDouble(salarioString);
		}
		
		for(double item : salario) {
			salarioTotal += item;
		}
		
		double salarioMedio = salarioTotal / salario.length;
		
		System.out.print(salarioMedio);
	}
}
