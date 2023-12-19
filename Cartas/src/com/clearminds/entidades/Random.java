package com.clearminds.entidades;

public class Random {

	public static int obtenerPosicion() {
		int numeroRandom = (int)(Math.random()*(51-0+1)+0);
		
		return numeroRandom;
	}
}
