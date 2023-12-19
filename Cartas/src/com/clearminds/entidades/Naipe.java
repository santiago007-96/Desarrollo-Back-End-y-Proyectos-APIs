package com.clearminds.entidades;

import java.util.ArrayList;

public class Naipe {

	private ArrayList<Numero> numerosPosibles = new ArrayList<Numero>();
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public Naipe () {
		this.numerosPosibles.add(new Numero("A", 11));
		this.numerosPosibles.add(new Numero("2", 2));
		this.numerosPosibles.add(new Numero("3", 3));
		this.numerosPosibles.add(new Numero("4", 4));
		this.numerosPosibles.add(new Numero("5", 5));
		this.numerosPosibles.add(new Numero("6", 6));
		this.numerosPosibles.add(new Numero("7", 7));
		this.numerosPosibles.add(new Numero("8", 8));
		this.numerosPosibles.add(new Numero("9", 9));
		this.numerosPosibles.add(new Numero("10", 10));
		this.numerosPosibles.add(new Numero("J", 10));
		this.numerosPosibles.add(new Numero("Q", 10));
		this.numerosPosibles.add(new Numero("K", 10));
		
		for(int i=0; i<this.numerosPosibles.size(); i++) {
			this.cartas.add(new Carta(this.numerosPosibles.get(i), "CR"));
			this.cartas.add(new Carta(this.numerosPosibles.get(i), "CN"));
			this.cartas.add(new Carta(this.numerosPosibles.get(i), "DI"));
			this.cartas.add(new Carta(this.numerosPosibles.get(i), "TR"));
		}
		
		
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public void imprimirNaipe() {
		System.out.println("CARTAS");
		for(int i=0; i<this.cartas.size(); i++) {
			
		}
	}
}
