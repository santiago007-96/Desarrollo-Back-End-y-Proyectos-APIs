package com.krakedev;

public class Cuadrado {

	double lado;
	
	public double calcularArea() {
		double Area;
		
		Area = Math.pow(lado, 2);
		
		return Area;
	}
	
	public double calcularPerimetro() {
		double Perimetro;
		
		Perimetro = lado * 4;
		
		return Perimetro;
	}
}
