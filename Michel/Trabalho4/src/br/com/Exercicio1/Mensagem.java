package br.com.Exercicio1;
 
import java.util.ArrayList;

public class Mensagem implements Runnable{  
	@Override
	public void run() {
			ArrayList<String> mensagem = new ArrayList<>();
			for(int i=0; i <20 ; i ++) {
				mensagem.add("Mensagem " + i);
			} 
				for(String item : mensagem) { 
				try {
					System.out.println(item);
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
	}
}
