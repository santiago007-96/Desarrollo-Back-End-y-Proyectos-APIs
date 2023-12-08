package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha1 = new Fecha();
		
		fecha1.setAnio(2023);
		fecha1.setMes(12);
		fecha1.setDia(8);
		
		System.out.println("Día: " + fecha1.getDia());
		System.out.println("Mes: " + fecha1.getMes());
		System.out.println("Anio: " + fecha1.getAnio());
	}

}
