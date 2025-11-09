package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Toyota", 2000, 1400.50);
		Auto auto2 = new Auto("Ford", 2015, 12313.2);
		
		//auto1.setMarca("Toyota");
		//auto1.setAnio(2000);
		//auto1.setPrecio(1400.68);
		
		//auto2.setMarca("Ford");
		//auto2.setAnio(2015);
		//auto2.setPrecio(14256.47);
		
		System.out.println("--Auto 1---");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		System.out.println("--Auto 2---");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}

}
