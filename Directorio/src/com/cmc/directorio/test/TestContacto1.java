package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telef = new Telefono("claro","094352154", 40);
		Contacto c = new Contacto("Alexander", "Jaramillo", telef, 122.67);
		
		System.out.println("------Contacto--------");
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Número de Telefono: " + c.getTelefono().getNumero());
		System.out.println("Operadora: " + c.getTelefono().getOperadora());
	}

}
