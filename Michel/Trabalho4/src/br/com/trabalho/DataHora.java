package br.com.trabalho;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class DataHora implements Runnable{  
	@Override
	public void run() { 
				try {
					while(true) {
						System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM:SS")));
						Thread.sleep(10000);
					} 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
	}
