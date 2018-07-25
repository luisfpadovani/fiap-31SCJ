package br.com.trabalho;
 

public class Gerenciador implements Runnable{  
	@Override
	public void run() { 
				try {

					Thread mensagem = new Thread(new Mensagem());  
					Thread dtThread = new Thread(new DataHora());

					mensagem.start();
					dtThread.start();
					
					while(true) { 

						System.out.println("Thread Mensagem está ->" + mensagem.getState());
						System.out.println("Thread Data e Hora está ->" + dtThread.getState());
						
						Thread.sleep(5000);
					} 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
	}
