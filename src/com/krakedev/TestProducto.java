package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("Vitaminas");
		productoA.setDescripcion("C y E");
		productoA.setPrecio(5.68);
		productoA.setStockActual(25);

		productoB.setNombre("Medicina para la tos");
		productoB.setDescripcion("En pastillas");
		productoB.setPrecio(4.26);
		productoB.setStockActual(75);
		
		productoC.setNombre("Curitas");
		productoC.setDescripcion("Transparentes");
		productoC.setPrecio(1.25);
		productoC.setStockActual(14);
		
		
		System.out.println("---Producto A---");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripció: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Actual: " + productoA.getStockActual());
		
		System.out.println("---Producto B---");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripció: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Actual: " + productoB.getStockActual());
		
		System.out.println("---Producto C---");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripció: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Actual: " + productoC.getStockActual());
	}

}
