package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1, celda2, celda3, celda4;
	private double saldo;
	

	
	public void configurarMaquina(String codigoCelda, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		this.celda1 = new Celda(codigoCelda);
		this.celda2 = new Celda(codigoCelda2);
		this.celda3 = new Celda(codigoCelda3);
		this.celda4 = new Celda(codigoCelda4);
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
		if (this.celda1.getCodigo().contains(codigoCelda)) {
			this.celda1.ingresarProducto(producto, itemsProductoColocar);
		} else if (this.celda2.getCodigo().contains(codigoCelda)) {
			this.celda2.ingresarProducto(producto, itemsProductoColocar);
		} else if (this.celda3.getCodigo().contains(codigoCelda)) {
			this.celda3.ingresarProducto(producto, itemsProductoColocar);
		} else if (this.celda4.getCodigo().contains(codigoCelda)) {
			this.celda4.ingresarProducto(producto, itemsProductoColocar);
		} 
		
	}
	
	public void mostrarProductos() {
		System.out.println("**********************************");
		System.out.println("-------------CELDA 1-------------");
		if(this.celda1.getProducto() == null){
			System.out.println("no existe la celda");
		} else {
			System.out.println("Código Celda: " + this.celda1.getCodigo());
			System.out.println("Nombre Producto: " + this.celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + this.celda1.getProducto().getPrecio());
			System.out.println("Stock: " + this.celda1.getStock());
		}	
		
		System.out.println("-------------CELDA 2-------------");
		if (this.celda2.getProducto() == null) {
			System.out.println("no existe la celda");
		} else {
			System.out.println("Código Celda: " + this.celda2.getCodigo());
			System.out.println("Nombre Producto: " + this.celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + this.celda2.getProducto().getPrecio());
			System.out.println("Stock: " + this.celda2.getStock());
		}
		
		System.out.println("-------------CELDA 3-------------");
		if (this.celda3.getProducto() == null) {
			System.out.println("no existe la celda");
		} else {
			System.out.println("Código Celda: " + this.celda3.getCodigo());
			System.out.println("Nombre Producto: " + this.celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + this.celda3.getProducto().getPrecio());
			System.out.println("Stock: " + this.celda3.getStock());
		}
		
		System.out.println("-------------CELDA 4-------------");
		if (this.celda4.getProducto() == null) {
			System.out.println("no existe la celda");
		} else {
			System.out.println("Código Celda: " + this.celda4.getCodigo());
			System.out.println("Nombre Producto: " + this.celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + this.celda4.getProducto().getPrecio());
			System.out.println("Stock: " + this.celda4.getStock());
		}
		
		System.out.println("");
		System.out.println("************************");
		System.out.println("Saldo de la máquina: " + this.saldo);
		System.out.println("************************");
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
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		if (this.celda1.getProducto().getCodigo().contains(codigoProducto)) {
			return this.celda1;
		} else if (this.celda2.getProducto().getCodigo().contains(codigoProducto)) {
			return this.celda2;
		} else if (this.celda3.getProducto().getCodigo().contains(codigoProducto) ) {
			return this.celda3;
		} else if (this.celda4.getProducto().getCodigo().contains(codigoProducto) ) {
			return this.celda4;
		} else {
			return null;
		}
	}
	
	public void incrementarProductos(String codigoProducto, int cantItemsIncrementar) {
		Celda celdaEncontrada = this.buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(cantItemsIncrementar);
		}
	}
	
	public void vender(String codigoCelda) {
		Celda celdaEncontrada = this.buscarCelda(codigoCelda);
		if (celdaEncontrada != null) {
			// Disminuye stock
			int stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual - 1);
			// Suma el precio del producto vendido al saldo
			this.saldo = this.saldo + celdaEncontrada.getProducto().getPrecio();
			//Muestra los productos actualizados
			this.mostrarProductos();
			System.out.println("");
			System.out.println("************************");
			System.out.println("Saldo de la máquina: " + this.saldo);
			System.out.println("************************");
		}
	}
	
	public double venderConCambio(String codigoCelda, double valorIngresado) {
		double saldoActual = this.saldo;
		this.vender(codigoCelda);
		if(saldoActual != this.saldo) {
			Celda celdaEncontrada = this.buscarCelda(codigoCelda);
			double cambio = valorIngresado - celdaEncontrada.getProducto().getPrecio();
			return cambio;
		} else {
			// No vendío nada
			return 0;
		}
	}
}
