package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "Vitaminas";
		productoA.descripcion = "C y E";
		productoA.precio = 5.68;
		productoA.stockActual = 25;

		productoB.nombre = "Medicina para la tos";
		productoB.descripcion = "En pastillas";
		productoB.precio = 4.26;
		productoB.stockActual = 75;
		
		productoC.nombre = "Curitas";
		productoC.descripcion = "Transparentes";
		productoC.precio = 1.25;
		productoC.stockActual = 14;
		
		
		System.out.println("---Producto A---");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripció: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock Actual: " + productoA.stockActual);
		
		System.out.println("---Producto B---");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripció: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock Actual: " + productoB.stockActual);
		
		System.out.println("---Producto C---");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripció: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock Actual: " + productoC.stockActual);
	}

}
