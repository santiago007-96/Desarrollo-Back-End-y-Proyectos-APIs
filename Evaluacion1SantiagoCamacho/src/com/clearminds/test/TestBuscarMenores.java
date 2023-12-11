package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));
		
		ArrayList<Producto> productosMenores = new ArrayList<Producto>();
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		
		Producto producto3=new Producto("F123","Kachito",1.05);
		maquina.cargarProducto(producto2, "A2", 6);
		
		Producto producto4=new Producto("G789","Rizadas",0.45);
		maquina.cargarProducto(producto2, "B2", 6);
		
		Producto producto5=new Producto("H763","Gatorade",1.10);
		maquina.cargarProducto(producto2, "C2", 6);
		
		Producto producto6=new Producto("I442","Powerade",1.05);
		maquina.cargarProducto(producto2, "C1", 6);
		
		productosMenores = maquina.buscarMenores(0.80);
		
		System.out.println("Productos Menores: " + productosMenores.size());
		Producto elementoProducto;
		for(int i=0; i < productosMenores.size(); i++) {
			elementoProducto = productosMenores.get(i);
			System.out.println("Nombre: " + elementoProducto.getNombre() + " Precio: " + elementoProducto.getPrecio());
		}
	}

}
