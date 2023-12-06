package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto productoA, productoB, productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		productoA.nombre = "Suncare 100";
		productoA.descripcion = "Protección solar contra radiación UVA y UVB - FPS100";
		productoA.precio = 16.90;
		productoA.stockAactual = 35;
		
		productoB.nombre = "Loción ATODERM SOS";
		productoB.descripcion = "Loción en aerosol que brinda alivio inmediato del picor en un solo gesto.";
		productoB.precio = 27.50;
		productoB.stockAactual = 25;
		
		productoC.nombre = "Crema limpiadora EUCERIN";
		productoC.descripcion = "Limpia en profundidad y remueve el maquillaje eficazmente";
		productoC.precio = 19.05;
		productoC.stockAactual = 28;
		
		System.out.println("Producto A");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripción: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock: " + productoA.stockAactual);
		
		System.out.println("-----------------------");
		
		System.out.println("Producto B");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripción: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock: " + productoB.stockAactual);
		
		System.out.println("-----------------------");
		
		System.out.println("Producto C");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripción: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock: " + productoC.stockAactual);
		
	}

}
