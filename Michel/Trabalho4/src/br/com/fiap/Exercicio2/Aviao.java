package br.com.fiap.Exercicio2;

public class Aviao extends Thread {
	Aviao(String nomeVoo, Aeroporto aeroporto){
		this.nomeVoo = nomeVoo;
		this.aeroporto = aeroporto;
	}
	
	private String nomeVoo;
	private Aeroporto aeroporto;
	
	public String getNomeVoo() {
		return nomeVoo;
	}

	public void setNomeVoo(String nomeVoo) {
		this.nomeVoo = nomeVoo;
	}

	public Aeroporto getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(Aeroporto aeroporto) {
		this.aeroporto = aeroporto;
	}
	
	public void Decolar() {
		Aeroporto aeroporto = this.aeroporto;
		if(aeroporto.isStatuPista()) {
			System.out.println("Avião pronto para decolar " + this.getNomeVoo());
		}
	}
	
	public void Voar() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Aterrissar() {
		Aeroporto aeroporto = this.aeroporto;
		if(aeroporto.isStatuPista()) {
			System.out.println("Avião pronto para aterrissar " + this.getNomeVoo());
		}
	}
	
	
	@Override
    public void run() { 
        Voar(); 
    }
}
