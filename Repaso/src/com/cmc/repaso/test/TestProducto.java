package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto("Laptop",450.05);
		double precioDescuento;
		
		producto.setPrecio(-850);
		System.out.println("Precio cambiado 1: " + producto.getPrecio());
		producto.setPrecio(250.45);
		System.out.println("Precio cambiado 2: " + producto.getPrecio());
		
		precioDescuento = producto.calcularPrecioPromo(25);
		System.out.println("Precio con descuento: " + precioDescuento);

	}

}
