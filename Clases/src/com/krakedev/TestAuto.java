package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1, auto2;
		
		auto1 = new Auto("Toyota", 2020, 30.509);
		auto2 = new Auto("Ford", 2022, 32.005);
		
		
		System.out.println("Primer Auto");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		
		System.out.println("-----------------------");
		
		System.out.println("Segundo Auto");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}

}
