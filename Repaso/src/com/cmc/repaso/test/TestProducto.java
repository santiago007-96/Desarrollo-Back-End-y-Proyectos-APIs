package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto = new Producto("Lapto", 750);
		
		System.out.println("Precio de Lapto: " + producto.getPrecio());
		
		System.out.println("Precio con 20% descuento: " + producto.calcularPrecioPromo(20));
	}

}
