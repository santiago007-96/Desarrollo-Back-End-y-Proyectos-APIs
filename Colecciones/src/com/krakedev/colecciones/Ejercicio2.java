package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		Persona p1 = new Persona("Juan", "Perez", 14);
		personas.add(p1);
		personas.add(new Persona("Cristian", "González", 17));
		personas.add(new Persona("Jennifer", "González", 34));
		
		Persona elementoPersona;
		for(int i=0; i<personas.size(); i++) {
			elementoPersona = personas.get(i);
			System.out.println(elementoPersona.getNombre() + " " + elementoPersona.getApellido());
		}
	}

}
