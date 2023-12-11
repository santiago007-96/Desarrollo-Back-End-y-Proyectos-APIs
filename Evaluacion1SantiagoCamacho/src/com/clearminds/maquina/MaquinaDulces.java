package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas = new ArrayList<Celda>();;
	private double saldo;
	
	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("-------------CELDAS-----------");
		Celda elementoCelda;
		for(int i=0; i<this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			System.out.println("Celda: " + elementoCelda.getCodigo());
		}
		//System.out.println("Saldo: " + this.saldo);
	}
	
	public Celda buscarCelda(String codigoCelda) {
		Celda elementoCelda;
		for(int i=0; i<this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			if (elementoCelda.getCodigo().equals(codigoCelda)) {
				return elementoCelda;
			}

		}
		elementoCelda = null;
		return elementoCelda;
	}
	
	public void cargarProducto(Producto producto, String codigoCelda, int itemsProductoColocar) {
		Celda celdaRecuperada;
		for(int i=0; i<this.celdas.size(); i++) {
			celdaRecuperada = this.buscarCelda(codigoCelda);
			if(celdaRecuperada != null) {
				celdaRecuperada.ingresarProducto(producto, itemsProductoColocar);
			}
		}
	}
	
	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			if(elementoCelda.getProducto() != null) {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
				+ " Producto: " + elementoCelda.getProducto().getCodigo() + " Precio: "
				+ elementoCelda.getProducto().getPrecio());
			} else {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock() + " Sin Producto Asignado");
			}
			
		}
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda elementoCelda;
		Producto producto = null;
		for (int i = 0; i < this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			if(elementoCelda.getCodigo().equals(codigoCelda)) {
				producto = elementoCelda.getProducto();
				return producto;
			} 
		}
		return producto;
	}
	
	public double consultarPrecio(String codigoCelda) {
		Celda elementoCelda;
		double precio = 0;
		for (int i = 0; i < this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			if(elementoCelda.getCodigo().equals(codigoCelda)) {
				precio = elementoCelda.getProducto().getPrecio();
				return precio;
			} 
		}
		return precio;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda elementoCelda = null;
		for (int i = 0; i < this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			if(elementoCelda.getProducto() != null) {
				if(elementoCelda.getProducto().getCodigo().equals(codigoProducto)) {
					return elementoCelda;
				}
				
			}
		}
		return elementoCelda;
	}
	
	public void incrementarProductos(String codigoProducto, int cantItemsIncrementar) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		for (int i = 0; i < this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			if(elementoCelda.getProducto() != null) {
				celdaEncontrada = this.buscarCeldaProducto(elementoCelda.getProducto().getCodigo());
				if(celdaEncontrada != null) {
					int stockActual = celdaEncontrada.getStock();
					celdaEncontrada.setStock(stockActual + cantItemsIncrementar);
				}
			}
			
		}
	}
	
	public void vender(String codigoCelda) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		for (int i = 0; i < this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			if(elementoCelda.getProducto() != null) {
				celdaEncontrada = this.buscarCelda(codigoCelda);
				if (celdaEncontrada != null) {
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
		}
	}
	
	public double venderConCambio(String codigoCelda, double valorIngresado) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		double saldoActual = this.saldo;
		this.vender(codigoCelda);
		if(saldoActual != this.saldo) {
			celdaEncontrada = this.buscarCelda(codigoCelda);
			double cambio = valorIngresado - celdaEncontrada.getProducto().getPrecio();
			return cambio;
		} else {
			// No vendío nada
			return 0;
		}
	}
	
	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productosMenores = new ArrayList<Producto>();
		Celda elementoCelda = null;
		Producto producto = null;
		for (int i = 0; i < this.celdas.size(); i++) {
			elementoCelda = this.celdas.get(i);
			if(elementoCelda.getProducto() != null) {
				System.out.println(elementoCelda.getCodigo());
				if(Double.compare(elementoCelda.getProducto().getPrecio(), limite) < 0) {
					producto = new Producto(elementoCelda.getProducto().getCodigo(), elementoCelda.getProducto().getNombre(), elementoCelda.getProducto().getPrecio());
					productosMenores.add(producto);
				}
			}
		}
		
		return productosMenores;
	}
	
	
}
