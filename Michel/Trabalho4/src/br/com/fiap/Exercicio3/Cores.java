package br.com.fiap.Exercicio3;

public enum Cores {
	
	
	 Branco ("21"),
	 Preto("22"),
	 Vermelho("23"), 
	 Amarelo("24"),
	 Azul("25");
	 
	    private String id;
	 
	    Cores(String id) {
	        this.id = id;
	    }
	 
	    public String getCodigo() {
	        return id;
	    }
	    
	    @Override
	    public String toString() {
	        return name();
	    } 
}
