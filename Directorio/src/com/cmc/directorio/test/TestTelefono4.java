package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi", "0945225645", 15);
		Telefono telf2 = new Telefono("claro", "0945225645", 35);
		Telefono telf3 = new Telefono("claro", "0945225645", 25);
		Telefono telf4 = new Telefono("claro", "0945225645", 25);

		AdminTelefono at = new AdminTelefono();
		int telClaro;
		
		telClaro = at.contarClaro(telf, telf2, telf3, telf4);
		
		System.out.println("Total de Telefonos Movi: " + telClaro);
		
		
	}

}
