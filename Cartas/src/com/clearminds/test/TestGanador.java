package com.clearminds.test;

import com.clearminds.servicios.*;

public class TestGanador {

	public static void main(String[] args) {
		String [] jugadores =   {"jugador 1","jugador 2","jugador 3"};
		Juego juego = new Juego(jugadores);

        juego.entregarCartas(5); 

        for (String jugador : jugadores) {
            int total = juego.devolverTotal(jugador);
            System.out.println("Total de " + jugador + ": " + total);
        }

    //    String ganador = juego.determinarGanador();
    //    System.out.println("El ganador es: " + ganador);

	}

}