package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1, auto2;
		
		auto1 = new Auto();
		auto2 = new Auto();
		
		auto1.marca = "Toyota";
		auto1.anio = 2020;
		auto2.precio = 30.500;
		
		auto2.marca = "Ford";
		auto2.anio = 2022;
		auto2.precio = 32.000;
		
		System.out.println("Primer Auto");
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		
		System.out.println("-----------------------");
		
		System.out.println("Segundo Auto");
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}

}
