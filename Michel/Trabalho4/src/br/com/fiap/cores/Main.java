package br.com.fiap.cores;

public class Main {

	public static void main(String[] args) {
		for (Cores t : Cores.values()) {
		      System.out.println(t.toString() +" ---- " +t.getCodigo());
		  }
		System.out.println("-----------------------------");
		System.out.println("Codigo da cor branco -> " + Cores.Branco.getCodigo());
	}
}
