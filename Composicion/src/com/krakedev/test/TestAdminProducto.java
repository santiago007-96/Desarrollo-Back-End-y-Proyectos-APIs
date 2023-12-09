package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto mc;
		AdminProducto admin = new AdminProducto();
		Producto productoA = new Producto("Doritos", 0.50);
		Producto productoB = new Producto("Galak", 0.50);
		
		mc = admin.buscarMasCaro(productoA, productoB);
		
		if (mc == null) {
			System.out.println("Los productos son iguales");
		} else {
			System.out.println("Producto más caro: " + mc.getNombre());
		}
	}

}
