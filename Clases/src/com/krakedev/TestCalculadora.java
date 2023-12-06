package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta;
		
		calcu = new Calculadora();
		
		resultadoSuma = calcu.sumar(7, 33);
		resultadoResta = calcu.restar(19, 3);
		
		System.out.println("Resultado de Suma: " + resultadoSuma);
		System.out.println("Resultado de Resta: " + resultadoResta);
	}

}
