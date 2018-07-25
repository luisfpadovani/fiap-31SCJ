package br.com.fiap;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.WeakHashMap;

public class Exercicio3 {

	private static int contatorFinal = 10000;
	private static ArrayList<String> Arraylist = new ArrayList<>();
	private static LinkedList<String> Linkedlist = new LinkedList<>();
	private static Stack<String> listStack = new Stack<String>();
	private static HashSet<String> listHasSet = new HashSet<String>();
	private static HashMap<Integer, String> listHash = new HashMap<Integer, String>();
	private static WeakHashMap<Integer, String> listWeak = new WeakHashMap<Integer, String>();
	
	public static void main(String[] args) {
		 ColecaoArrayListInsercao() ;
		ColecaoLinkedListInsercao();
		 
		ColecaoStackListInsercao();
		ColecaoStackHasSetInsercao();
		 
		ColecaoStackHasInsercao();
		ColecaoWeakListInsercao();
		
		ColecaoArrayListBusca() ;
		ColecaoLinkedListBusca();
				 
		ColecaoStackListBusca();
		ColecaoStackHasSetBusca();
				 
		ColecaoStackHasBusca();
		ColecaoWeakListBusca();
	}
	
	//INSERCAO
	
	//HASHMAP LIST
		public static void ColecaoWeakListInsercao() {
			LocalDateTime dataInicio = LocalDateTime.now();	
			for(int i = 0; i <= contatorFinal;i++) {
				listWeak.put(i, "NOME" + i);
			}
			LocalDateTime dataFim = LocalDateTime.now();
			long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
			System.out.println(segundos + " Segundos Weak Inser��o");
		}

		
		//HASHMAP LIST
		public static void ColecaoStackHasInsercao() {
			LocalDateTime dataInicio = LocalDateTime.now();	
			for(int i = 0; i <= contatorFinal;i++) {
				listHash.put(i, "NOME" + i);
			}
			LocalDateTime dataFim = LocalDateTime.now();
			long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
			System.out.println(segundos + " Segundos HashMap Inser��o");
		}

	//HASHMAP LIST
	public static void ColecaoStackHasSetInsercao() {
		LocalDateTime dataInicio = LocalDateTime.now();	
		for(int i = 0; i <= contatorFinal;i++) {
			listHasSet.add("NOME" + i);
		}
		LocalDateTime dataFim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
		System.out.println(segundos + " Segundos HashSet Inser��o");
	}

	
	//STACK LIST
		public static void ColecaoStackListInsercao() {
			LocalDateTime dataInicio = LocalDateTime.now();	
			for(int i = 0; i <= contatorFinal;i++) {
				listStack.push("Nome"+ i);
			}
			LocalDateTime dataFim = LocalDateTime.now();
			long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
			System.out.println(segundos + " Segundos Stack Inser��o");
		}
	
	//ARRAY LIST
	public static void ColecaoArrayListInsercao() {
		LocalDateTime dataInicio = LocalDateTime.now();	
		for(int i = 0; i <= contatorFinal;i++) {
			Arraylist.add("Nome" + i);
		}
		LocalDateTime dataFim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
		System.out.println(segundos + " Segundos Array Inser��o");
	}

	//LINKED LIST
	public static void ColecaoLinkedListInsercao() {
		LocalDateTime dataInicio = LocalDateTime.now();		
		for(int i = 0; i <= contatorFinal;i++) {
			Linkedlist.add("Nome" + i);
		}  
		LocalDateTime dataFim = LocalDateTime.now(); 
		long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
		System.out.println(segundos + " Segundos Linked Inser��o");
	}

	
	

	
	//BUSCA

	//HASHMAP LIST
		public static void ColecaoWeakListBusca() {
			LocalDateTime dataInicio = LocalDateTime.now(); 
			listWeak.get(5000); 
			LocalDateTime dataFim = LocalDateTime.now();
			long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
			System.out.println(segundos + " Segundos Weak Busca");
		}

		
		//HASHMAP LIST
		public static void ColecaoStackHasBusca() {
			LocalDateTime dataInicio = LocalDateTime.now();	
			listHash.get(5000);
			LocalDateTime dataFim = LocalDateTime.now();
			long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
			System.out.println(segundos + " Segundos HashMap Busca");
		}

	//HASHMAP LIST
	public static void ColecaoStackHasSetBusca() {
		LocalDateTime dataInicio = LocalDateTime.now();	 
		listHasSet.contains(5000); 		
		LocalDateTime dataFim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
		System.out.println(segundos + " Segundos HashSet Busca");
	}

	
	//STACK LIST
		public static void ColecaoStackListBusca() {
			LocalDateTime dataInicio = LocalDateTime.now();	 
			listStack.get(5000); 
			LocalDateTime dataFim = LocalDateTime.now();
			long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
			System.out.println(segundos + " Segundos Stack Busca");
		}
	
	//ARRAY LIST
	public static void ColecaoArrayListBusca() {
		LocalDateTime dataInicio = LocalDateTime.now();	
		Arraylist.get(5000);
		LocalDateTime dataFim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
		System.out.println(segundos + " Segundos Array Busca");
	}

	//LINKED LIST
	public static void ColecaoLinkedListBusca() {
		LocalDateTime dataInicio = LocalDateTime.now();		
		Linkedlist.get(5000);
		LocalDateTime dataFim = LocalDateTime.now(); 
		long segundos = ChronoUnit.NANOS.between(dataInicio,dataFim); 
		System.out.println(segundos + " Segundos Linked Busca");
	}

	
	
	
}
