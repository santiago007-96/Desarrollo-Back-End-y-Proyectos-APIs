package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		double areaR1, areaR2;
		double perimetroR1, perimetroR2;
		
		r1.setBase(10);
		r1.setAltura(5);
		r2.setBase(8);
		r2.setAltura(3);
		
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
