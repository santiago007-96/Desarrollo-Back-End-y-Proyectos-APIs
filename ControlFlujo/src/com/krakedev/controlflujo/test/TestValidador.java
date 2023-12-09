package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validador validador = new Validador();
		validador.validarEdad(12);
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(8);
		validador.validarEdad(-1);
		validador.validarEdad(3);
	}

}
