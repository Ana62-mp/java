package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca = "Toyota";
		auto1.anio = 2000;
		auto1.precio = 1400.68;
		
		auto2.marca = "Ford";
		auto2.anio = 2015;
		auto2.precio = 14256.47;
		
		System.out.println("--Auto 1---");
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		System.out.println("--Auto 2---");
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}

}
