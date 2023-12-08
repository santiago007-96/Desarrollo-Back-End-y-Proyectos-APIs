package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		double areaC1, areaC2, areaC3;
		double perimetroC1, perimetroC2, perimetroC3;
		
		c1.setLado(4);
		c2.setLado(3);
		c3.setLado(9);
		
		areaC1 = c1.calcularArea();
		areaC2 = c2.calcularArea();
		areaC3 = c3.calcularArea();
		perimetroC1 = c1.calcularPerimetro();
		perimetroC2 = c2.calcularPerimetro();
		perimetroC3 = c3.calcularPerimetro();
		
		
		System.out.println("Área de c1: " + areaC1);
		System.out.println("Área de c2: " + areaC2);
		System.out.println("Área de c3: " + areaC3);
		System.out.println("Perímetro de c1: " + perimetroC1);
		System.out.println("Perímetro de c2: " + perimetroC2);
		System.out.println("Perímetro de c3: " + perimetroC3);

	}

}
