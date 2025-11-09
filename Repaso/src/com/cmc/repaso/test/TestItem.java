package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item("Cartulina");
		Item item2 = new Item("Resaltadores");
		
		item1.setProductosActuales(20);
		item2.setProductosActuales(50);
		
		System.out.println("---Valores Iniciales ITEM1---");
		item1.imprimir();
		
		System.out.println("---Valores después de métodos ITEM1---");
		item1.vender(15);
		item1.devolver(7);
		item1.imprimir();
		
		System.out.println("---Valores Iniciales ITEM2---");
		item1.imprimir();
		
		System.out.println("---Valores después de métodos ITEM2---");
		item2.vender(25);
		item2.devolver(5);
		item2.imprimir();

		

	}

}
