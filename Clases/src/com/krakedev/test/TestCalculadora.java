package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta, resultadoMultiplicacion, resultadoDivision, resultadoPromediar;
		
		
		calcu = new Calculadora();
		
		resultadoSuma = calcu.sumar(7, 33);
		resultadoResta = calcu.restar(19, 3);
		resultadoMultiplicacion = calcu.multiplicar(10, 5);
		resultadoDivision = calcu.dividir(10, 2);
		resultadoPromediar = calcu.promediar(10, 8, 9);
		
		System.out.println("Resultado de Suma: " + resultadoSuma);
		System.out.println("Resultado de Resta: " + resultadoResta);
		System.out.println("Resultado de Multiplicacion: " + resultadoMultiplicacion);
		System.out.println("Resultado de Division: " + resultadoDivision);
		System.out.println("Resultado de Promediar: " + resultadoPromediar);
		
		calcu.mostrarResultado();
	}

}
