package com.krakedev.colecciones.test;

import com.krakedev.colecciones.AdminPersonas;
import com.krakedev.colecciones.Persona;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Mario", "Benedetti", 32));
		admin.agregar(new Persona("Clara", "Benedetti", 22));
		admin.agregar(new Persona("Bruno", "Benedetti", 43));
		admin.imprimir();
		
		Persona p1 = admin.buscarPorNombre("Bruno");
		if (p1 != null) {
			System.out.println("Encontrado: " + p1.getNombre() + " " + p1.getApellido() + " " + p1.getEdad());

		} else {
			System.out.println("No existe la persona");
		}
	}

}
