package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1, auto2;
		
		auto1 = new Auto();
		auto2 = new Auto();
		
		auto1.setMarca("Toyota");
		auto1.setAnio(2020);
		auto1.setPrecio(30.509);
		
		auto2.setMarca("Ford");
		auto2.setAnio(2022);
		auto2.setPrecio(32.005);
		
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
