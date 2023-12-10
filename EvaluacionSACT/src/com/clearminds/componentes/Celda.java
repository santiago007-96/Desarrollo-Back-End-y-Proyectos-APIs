package com.clearminds.componentes;

public class Celda {

	private Producto producto;
	private int stock;
	private String codigo;
	
	public Celda(String codigo) {
		this.codigo = codigo;
	}
	
	public void ingresarProducto(Producto producto, int stockInicial) {
		this.stock = stockInicial;
		this.producto.setCodigo(producto.getCodigo());
		this.producto.setNombre(producto.getNombre());
		this.producto.setPrecio(producto.getPrecio());
	}
}
