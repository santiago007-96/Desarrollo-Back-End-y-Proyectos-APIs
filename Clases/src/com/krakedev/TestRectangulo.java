package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		
		double areaR1, areaR2;
		double perimetro;
		
		r1.base = 10;
		r1.altura = 5;
		r2.base = 8;
		r2.altura = 3;
		r3.base = 4;
		r3.altura = 2;
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		perimetro = r3.calcularPerimetro();
		
		System.out.println("Área de r1: " + areaR1);
		System.out.println("Área de r2: " + areaR2);
		System.out.println("Perímetro de r3: " + perimetro);
	}

}
