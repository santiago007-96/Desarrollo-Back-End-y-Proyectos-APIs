package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telef1 = new Telefono("claro","094352154", 40); 
		Contacto c1 = new Contacto("Jennifer", "Cueva", telef1, 130.3);
		AdminContactos ac = new AdminContactos();
		
		
		System.out.println("---------Contacto------");
		System.out.println("Nombre: " + c1.getNombre());
		System.out.println("Apellido: " + c1.getApellido());
		System.out.println("Número de Telefono: " + c1.getTelefono().getNumero());
		System.out.println("Operadora: " + c1.getTelefono().getOperadora());
		System.out.println("Activo: " + c1.isActivo());
		
		ac.activarUsuario(c1);
		
		System.out.println("---------Contacto Activado------");
		System.out.println("Nombre: " + c1.getNombre());
		System.out.println("Apellido: " + c1.getApellido());
		System.out.println("Número de Telefono: " + c1.getTelefono().getNumero());
		System.out.println("Operadora: " + c1.getTelefono().getOperadora());
		System.out.println("Activo: " + c1.isActivo());
	}

}
