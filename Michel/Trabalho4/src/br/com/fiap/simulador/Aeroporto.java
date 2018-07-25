package br.com.fiap.simulador;

public class Aeroporto extends Thread {
	
	Aeroporto(String nomeAeroporto){
		this.nomeAeroporto = nomeAeroporto; 
	}
	
	private String nomeAeroporto; 
	private boolean statuPista;
	
	public String getNomeAeroporto() {
		return nomeAeroporto;
	}

	public void setNomeVoo(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}

	 public void aguardarPistaDisponivel () {
		 if(this.isStatuPista()) {
			 System.out.println("Pista disponivel");
		 }
	 }
	 
	 public void alterarEstadoPista (boolean statuPista) {
		 try {
				Thread.sleep(2000);
				this.statuPista = statuPista;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }

	public boolean isStatuPista() {
		return statuPista;
	}

	public void setStatuPista(boolean statuPista) {
		this.statuPista = statuPista;
	}
	
	@Override
    public void run() { 
        alterarEstadoPista(!this.isStatuPista());  
    }
}
