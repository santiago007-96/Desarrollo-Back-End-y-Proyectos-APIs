package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item();
		Item item2 = new Item();
		
		item.setNombre("USB");
		item.setProductosActuales(20);
		
		item2.setNombre("Mouse");
		item2.setProductosActuales(45);
		
		item.imprimir();
		item2.imprimir();
		
		item.vender(3);
		item.imprimir();
		
		item.devolver(1);
		item.imprimir();
		
		item2.imprimir();
		
		item2.vender(15);
		item2.imprimir();
		
		item2.devolver(5);
		item2.imprimir();
	}

}
