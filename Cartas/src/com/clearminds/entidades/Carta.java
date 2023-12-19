package com.clearminds.entidades;

public class Carta {

	private Numero numero;
	private String palo;
	
	
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}




	public void setPalo(String palo) {
		this.palo = palo;
	}




	public void mostrarInformacion() {
		System.err.println(this.numero + " - " + this.palo);
	}
	
	
}
