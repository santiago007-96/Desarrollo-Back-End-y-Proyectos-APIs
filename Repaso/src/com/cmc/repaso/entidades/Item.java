package com.cmc.repaso.entidades;

public class Item {

	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int prodcutosVendidos;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getProductosActuales() {
		return productosActuales;
	}


	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}


	public int getProductosDevueltos() {
		return productosDevueltos;
	}


	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}


	public int getProdcutosVendidos() {
		return prodcutosVendidos;
	}


	public void setProdcutosVendidos(int prodcutosVendidos) {
		this.prodcutosVendidos = prodcutosVendidos;
	}


	public void imprimir() {
		System.out.println("--------------DATOS----------");
		System.out.println("Producto: " + this.nombre);
		System.out.println("Productos Actuales: " + this.productosActuales);
		System.out.println("Productos Devueltos: " + this.productosDevueltos);
		System.out.println("Productos Vendidos: " + this.prodcutosVendidos);
	}
	
	public void vender(int productosVendidos) {
		this.prodcutosVendidos = this.prodcutosVendidos + productosVendidos;
		this.productosActuales = this.productosActuales - productosVendidos;
	}
	
	public void devolver(int productosVendidos) {
		this.productosActuales = this.productosActuales + productosVendidos;
		this.prodcutosVendidos = this.prodcutosVendidos - productosVendidos;
		this.productosDevueltos = this.productosDevueltos + productosVendidos;
	}
}
