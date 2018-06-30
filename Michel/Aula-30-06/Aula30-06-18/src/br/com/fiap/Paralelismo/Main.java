package br.com.fiap.Paralelismo;

public class Main {

	public static void main(String[] args) {

		new Thread(new Cavalo("Cavalo 1")).start();
		new Thread(new Cavalo("Cavalo 2")).start();
		new Thread(new Cavalo("Cavalo 3")).start();
		new Thread(new Cavalo("Cavalo 4")).start();
		new Thread(new Cavalo("Cavalo 5")).start();

	}

}
