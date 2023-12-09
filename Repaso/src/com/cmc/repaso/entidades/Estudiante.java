package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String nombre;
	private double nota;
	private String resultado;
	
	public void Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	public void calificar(double nota) {
		this.nota = nota;
		if(this.nota < 8) {
			this.resultado = "F";
		}
		else if(this.nota >= 0) {
			this.resultado = "A";
		}
	}
}
