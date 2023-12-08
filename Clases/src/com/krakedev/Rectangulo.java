package com.krakedev;

public class Rectangulo {

	private double base;
	private double altura;
	
	public double calcularArea() {
		double area;
		area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro = (base * 2) + (altura *2);
		
		return perimetro;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
