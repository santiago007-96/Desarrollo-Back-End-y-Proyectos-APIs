package com.krakedev;

public class Cuadrado {

	private double lado;
	
	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

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
