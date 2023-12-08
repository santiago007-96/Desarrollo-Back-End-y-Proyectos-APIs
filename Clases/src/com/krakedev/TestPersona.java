package com.krakedev;
/*
 * Comentario de varias lineas
 * 
 */
public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p, p2, p3; // Declaro la variable p de tipo Persona
		
		p = new Persona("Mario", 45, 1.75); //Instanciar un objeto Persona
		p2 = new Persona("Ana", 35, 1.69);
		p3 = new Persona("María", 26, 1.76);
		
		
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
		
		System.out.println("--------------");
		
		System.out.println("Nombre: " + p2.getNombre());
		System.out.println("Edad: " + p2.getEdad());
		System.out.println("Estatura: " + p2.getEstatura());
		
System.out.println("--------------");
		
		System.out.println("Nombre: " + p3.getNombre());
		System.out.println("Edad: " + p3.getEdad());
		System.out.println("Estatura: " + p3.getEstatura());
	}

}
