package com.clearminds.componentes;

public class Celda {

	private Producto producto;
	private int stock;
	private String codigo;
	
	public Celda(String codigo) {
		this.codigo = codigo;
	}
	
	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void ingresarProducto(Producto producto, int stockInicial) {
		this.stock = stockInicial;
		this.producto.setCodigo(producto.getCodigo());
		this.producto.setNombre(producto.getNombre());
		this.producto.setPrecio(producto.getPrecio());
	}
	
	public void imprimir() {
			System.out.println("**********************************");
			System.out.println("Nombre Producto: " + this.producto.getNombre());
			System.out.println("Precio Producto: " + this.producto.getPrecio());
			System.out.println("Codigo Producto: " + this.producto.getCodigo());
			System.out.println("Stock: " + this.stock);
		
		
	}
}
