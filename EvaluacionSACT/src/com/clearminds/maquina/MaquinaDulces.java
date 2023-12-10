package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1, celda2, celda3, celda4;
	private double saldo;
	
	public MaquinaDulces() {
		
	}
	
	
	public void configurarMaquina(String codigoCelda, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		this.celda1.setCodigo(codigoCelda);
		this.celda2.setCodigo(codigoCelda2);
		this.celda3.setCodigo(codigoCelda3);
		this.celda4.setCodigo(codigoCelda4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("-------------CELDAS-----------");
		System.out.println("Celda 1: " + this.celda1.getCodigo());
		System.out.println("Celda 2: " + this.celda2.getCodigo());
		System.out.println("Celda 3: " + this.celda3.getCodigo());
		System.out.println("Celda 4: " + this.celda4.getCodigo());
		System.out.println("Saldo: " + this.saldo);
	}
	
	public Celda buscarCelda(String codigoCelda) {
		if (this.celda1.getCodigo().contains(codigoCelda)) {
			return this.celda1;
		} else if (this.celda2.getCodigo().contains(codigoCelda)) {
			return this.celda2;
		} else if (this.celda3.getCodigo().contains(codigoCelda)) {
			return this.celda3;
		} else if (this.celda4.getCodigo().contains(codigoCelda)) {
			return this.celda4;
		} else {
			return null;
		}
	}
	
	public void cargarProducto(Producto producto, String codigoCelda, int itemsProductoColocar) {
		Celda celdaRecuperada = this.buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, itemsProductoColocar);
		}
	}
	
	public void mostrarProductos() {
		System.out.println("**********************************");
		System.out.println("-------------CELDA 1-------------");
		System.out.println("Código Celda: " + this.celda1.getCodigo());
		System.out.println("Nombre Producto: " + this.celda1.getProducto().getNombre());
		System.out.println("Precio Producto: " + this.celda1.getProducto().getPrecio());
		System.out.println("Stock: " + this.celda1.getStock());
		System.out.println("-------------CELDA 2-------------");
		System.out.println("Código Celda: " + this.celda2.getCodigo());
		System.out.println("Nombre Producto: " + this.celda2.getProducto().getNombre());
		System.out.println("Precio Producto: " + this.celda2.getProducto().getPrecio());
		System.out.println("Stock: " + this.celda2.getStock());
		System.out.println("-------------CELDA 3-------------");
		System.out.println("Código Celda: " + this.celda3.getCodigo());
		System.out.println("Nombre Producto: " + this.celda3.getProducto().getNombre());
		System.out.println("Precio Producto: " + this.celda3.getProducto().getPrecio());
		System.out.println("Stock: " + this.celda3.getStock());
		System.out.println("-------------CELDA 4-------------");
		System.out.println("Código Celda: " + this.celda4.getCodigo());
		System.out.println("Nombre Producto: " + this.celda4.getProducto().getNombre());
		System.out.println("Precio Producto: " + this.celda4.getProducto().getPrecio());
		System.out.println("Stock: " + this.celda4.getStock());
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (this.celda1.getCodigo().contains(codigoCelda)) {
			return this.celda1.getProducto();
		} else if (this.celda2.getCodigo().contains(codigoCelda)) {
			return this.celda2.getProducto();
		} else if (this.celda3.getCodigo().contains(codigoCelda)) {
			return this.celda3.getProducto();
		} else if (this.celda4.getCodigo().contains(codigoCelda)) {
			return this.celda4.getProducto();
		} else {
			return null;
		}
	}
	
	public double consultarPrecio(String codigoCelda) {
		if (this.celda1.getCodigo().contains(codigoCelda)) {
			return this.celda1.getProducto().getPrecio();
		} else if (this.celda2.getCodigo().contains(codigoCelda)) {
			return this.celda2.getProducto().getPrecio();
		} else if (this.celda3.getCodigo().contains(codigoCelda)) {
			return this.celda3.getProducto().getPrecio();
		} else if (this.celda4.getCodigo().contains(codigoCelda)) {
			return this.celda4.getProducto().getPrecio();
		} else {
			return 0;
		}
	}
}
