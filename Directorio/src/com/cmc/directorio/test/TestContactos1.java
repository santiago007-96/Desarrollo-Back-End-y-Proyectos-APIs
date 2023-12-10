package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telef1 = new Telefono("claro","094352154", 40); 
		Contacto c1 = new Contacto("José", "Enríquez", telef1, 230.3);
		Telefono telef2 = new Telefono("movi","094352154", 30); 
		Contacto c2 = new Contacto("Salomón", "Gutiérrez", telef2, 240.2);
		
		Contacto c3;
		AdminContactos ac = new AdminContactos();
		boolean operadoras;
		
		c3 = ac.buscarMasPesado(c1, c2);
		
		System.out.println("---------Contacto más pesado------");
		System.out.println("Nombre: " + c3.getNombre());
		System.out.println("Apellido: " + c3.getApellido());
		System.out.println("Número de Telefono: " + c3.getTelefono().getNumero());
		System.out.println("Operadora: " + c3.getTelefono().getOperadora());
		
		operadoras = ac.compararOperadoras(c1, c2);
		System.out.println("--------------------------------");
		System.out.println("Operadoras: " + operadoras);
	}

}
