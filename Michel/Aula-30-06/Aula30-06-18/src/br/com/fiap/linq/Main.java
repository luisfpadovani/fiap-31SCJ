package br.com.fiap.linq;

import java.time.LocalDate; 
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
	private static ArrayList<Cliente> listaCliente = new ArrayList<>();
	
	public static void main(String[] args) {
		PreencherClientes();
		listaCliente.stream()
		.filter(x -> ChronoUnit.YEARS.between(x.getDataPrimeiraCompra(),LocalDate.now()) > 5)
		.forEach(x -> x.setAtivo(false));
		
		listaCliente.forEach(u -> System.out.println(u)); 

		double mediaIdade = listaCliente.stream().mapToInt(x -> x.getIdade()).average().getAsDouble();
		int idadeMaxima = listaCliente.stream().mapToInt(x -> x.getIdade()).max().getAsInt();
		int idadeMinima = listaCliente.stream().mapToInt(x -> x.getIdade()).min().getAsInt();
	}
	
	private static void PreencherClientes() {  
		Cliente cliente1 =  new Cliente("Cliente 1",31,true, LocalDate.of(2010, Month.JULY, 1));
		Cliente cliente2 =  new Cliente("Cliente 2",32,true, LocalDate.of(2018, Month.JULY, 2));
		Cliente cliente3 =  new Cliente("Cliente 3",33,true, LocalDate.of(2018, Month.JULY, 3));
		Cliente cliente4 =  new Cliente("Cliente 4",34,true, LocalDate.of(2018, Month.JULY, 4));
		Cliente cliente5 =  new Cliente("Cliente 5",35,true, LocalDate.of(2018, Month.JULY, 5));
		
		listaCliente.add(cliente1);
		listaCliente.add(cliente2);
		listaCliente.add(cliente3);
		listaCliente.add(cliente4);
		
		
	}

}
