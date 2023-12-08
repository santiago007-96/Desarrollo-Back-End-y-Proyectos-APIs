package com.krakedev;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stockAactual;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStockAactual() {
		return stockAactual;
	}
	public void setStockAactual(int stockAactual) {
		this.stockAactual = stockAactual;
	}
	
	
}
