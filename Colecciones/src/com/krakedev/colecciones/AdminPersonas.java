package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {

	private ArrayList<Persona> personas;
	
	
	public AdminPersonas() {
		this.personas = new ArrayList<Persona>();
	}


	public void agregar(Persona persona) {
		personas.add(persona);
	}
	
	public void imprimir() {
		Persona elementoPersona;
		for(int i=0; i<personas.size(); i++) {
			elementoPersona = personas.get(i);
			System.out.println("Persona: " + elementoPersona.getNombre() + " " + elementoPersona.getApellido() + " " + elementoPersona.getEdad());
		}
	}
	
	public Persona buscarPorNombre(String nombre) {
		Persona elementoPersona = null;
		Persona personaEncontrada = null;
		for(int i=0; i<personas.size(); i++) {
			elementoPersona = personas.get(i);
			if (elementoPersona.getNombre().equals(nombre)) {
				personaEncontrada = elementoPersona;
			}
		}
		return personaEncontrada;
	}
}
