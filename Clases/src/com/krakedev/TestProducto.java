package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto productoA, productoB, productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		productoA.setNombre("Suncare 100");
		productoA.setDescripcion("Protección solar contra radiación UVA y UVB - FPS100");
		productoA.setPrecio(16.90);
		productoA.setStockAactual(35); 
		
		productoB.setNombre("Loción ATODERM SOS");
		productoB.setDescripcion("Loción en aerosol que brinda alivio inmediato del picor en un solo gesto.");
		productoB.setPrecio(27.50);
		productoB.setStockAactual(25);
		
		productoC.setNombre("Crema limpiadora EUCERIN");
		productoC.setDescripcion("Limpia en profundidad y remueve el maquillaje eficazmente");
		productoC.setPrecio(19.05);
		productoC.setStockAactual(28);
		
		System.out.println("Producto A");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripción: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock: " + productoA.getStockAactual());
		
		System.out.println("-----------------------");
		
		System.out.println("Producto B");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripción: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock: " + productoB.getStockAactual());
		
		System.out.println("-----------------------");
		
		System.out.println("Producto C");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripción: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock: " + productoC.getStockAactual());
		
	}

}
