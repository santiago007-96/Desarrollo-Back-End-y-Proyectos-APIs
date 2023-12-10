package com.clearminds.test;

import com.clearminds.componentes.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto producto = new Producto("Lapto", 750, "L323");
		
		System.out.println("***************");
		System.out.println("Código: " + producto.getCodigo());
		System.out.println("Nombre: " + producto.getNombre());
		System.out.println("Precio: " + producto.getPrecio());

		System.out.println("***************");
		System.out.println("");
		producto.incrementarPrecio(20);
		System.out.println("Precio con 20% incremento: "+  producto.getPrecio());
		producto.disminuirPrecio(12.0);
		System.out.println("Precio con 12 menos: "+  producto.getPrecio());

	}

}
