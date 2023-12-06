package com.krakedev;
/*
 * Comentario de varias lineas
 * 
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p, p2; // Declaro la variable p de tipo Persona
		
		p = new Persona(); //Instanciar un objeto Persona
		p2 = new Persona();
		
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.65;
		
		p2.nombre = "Ana";
		p2.edad = 35;
		p2.estatura = 1.59;
		
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);
		
		System.out.println("--------------");
		
		System.out.println("Nombre: " + p2.nombre);
		System.out.println("Edad: " + p2.edad);
		System.out.println("Estatura: " + p2.estatura);
	}

}
