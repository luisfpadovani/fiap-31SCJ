package br.com.fiap;
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {

	public static void main(String[] args) {
	  	 LocalDateTime date = LocalDateTime.now(); 
	  	 String anoMesDia = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM"));
	  	 String diaMesAno = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS"));
	  	 String diaSemana = date.format(DateTimeFormatter.ofPattern("E"));
		 String ano = date.format(DateTimeFormatter.ofPattern("u"));
		 String era = date.format(DateTimeFormatter.ofPattern("G"));

		 
		 System.out.println("ANO-MES-DIA HORA: " + anoMesDia);
		 System.out.println("DIA-MES-ANO HORA: " + diaMesAno);
		 System.out.println("DIA DA SEMANA: " + diaSemana);
		 System.out.println("ANO: " + ano);
	  	 System.out.println("ERA: " + era);
	}
}
