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
		
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.75);
		
		p2.setNombre("Ana");
		p2.setEdad(35);
		p2.setEstatura(1.59);
		
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
		
		System.out.println("--------------");
		
		System.out.println("Nombre: " + p2.getNombre());
		System.out.println("Edad: " + p2.getEdad());
		System.out.println("Estatura: " + p2.getEstatura());
	}

}
