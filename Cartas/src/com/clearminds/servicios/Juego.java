package com.clearminds.servicios;

import java.util.ArrayList;

import com.clearminds.entidades.Carta;
import com.clearminds.entidades.Naipe;

public class Juego {

	private Naipe naipe;
	private Naipe naipeBarajado;
	private ArrayList<String> jugadores;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	
	public Juego() {
		this.naipe = new Naipe();
		this.naipe.barajar();
		this.naipeBarajado = this.naipe;
	}
	
	public Juego(String [] idJugador) {
		
		int numJugadores = idJugador.length;
		ArrayList<Carta> cartas;
		jugadores = new ArrayList<String>();
		for(int i=0; i<numJugadores; i++) {
			jugadores.add(idJugador[i]);
			cartas = new ArrayList<Carta>();
			cartasJugador.add(cartas);
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}
	
	public void entregarCartas(int cartasPorJugador) {
		int contIndiceNaipe=0;
		for (int i=0; i<cartasPorJugador; i++) {
			for (int j=0; j<this.cartasJugador.size(); j++) {
				this.cartasJugador.get(j).add(this.naipeBarajado.getCartas().get(contIndiceNaipe));
				contIndiceNaipe++;
				j++;
			}
		}
	}
	
	public int devolverTotal(String idJugador) {
		int sumaTotal = 0;
		Carta cartaSeleccionada;
		for (int i=0; i<this.cartasJugador.size(); i++) {
			cartaSeleccionada = this.cartasJugador.get(i).get(i);
			
			sumaTotal = this.cartasJugador.get(i).get(i).getNumero().getValor();
					
		}
		return sumaTotal;
	}
}
