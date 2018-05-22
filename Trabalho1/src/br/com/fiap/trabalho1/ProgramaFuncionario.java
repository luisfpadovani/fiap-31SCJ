package br.com.fiap.trabalho1;
 

import java.util.HashSet;

import javax.swing.JOptionPane;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		HashSet<Funcionario> listaFuncionario = new HashSet<Funcionario>();
		double salarioMedio = 0; 
		while(true) {
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente outro salario?", null, JOptionPane.YES_NO_OPTION);

			if (resposta == JOptionPane.NO_OPTION) {
				break;
			}
			
			String salario  = JOptionPane.showInputDialog("Digite o salario do funcionario:");	
			double salarioFunc = Double.parseDouble(salario);			
			Funcionario func = new Funcionario();
			func.setSalario(salarioFunc);
			listaFuncionario.add(func);			
		}
		
		for(Funcionario item : listaFuncionario) {
			salarioMedio += item.getSalario();
		} 
		System.out.println(salarioMedio / listaFuncionario.size()); 
	} 
}
