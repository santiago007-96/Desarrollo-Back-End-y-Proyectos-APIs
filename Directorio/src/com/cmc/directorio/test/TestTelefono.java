package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tel = new Telefono("movi", "09941234123", 10);
		
		System.out.println("---------Datos Telefónico---------");
		System.out.println("Operadora: " + tel.getOperadora());
		System.out.println("Número: " + tel.getNumero());
		System.out.println("Código: " + tel.getCodigo());
		System.out.println("Tiene Whatsapp: " + tel.isTieneWhatsapp());
		
	}

}
