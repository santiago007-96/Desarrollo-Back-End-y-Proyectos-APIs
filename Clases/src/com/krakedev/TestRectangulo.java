package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		double areaR1, areaR2;
		double perimetroR1, perimetroR2;
		
		r1.base = 10;
		r1.altura = 5;
		r2.base = 8;
		r2.altura = 3;
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		perimetroR1 = r1.calcularPerimetro();
		perimetroR2 = r2.calcularPerimetro();
		
		System.out.println("Área de r1: " + areaR1);
		System.out.println("Área de r2: " + areaR2);
		System.out.println("Perímetro de r1: " + perimetroR1);
		System.out.println("Perímetro de r2: " + perimetroR2);
	}

}
