package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1) declaro variable p de tipo Persona
		Persona p2 = new Persona();
		Persona p3 = new Persona("Ana");
		Persona p4 = new Persona("Carol", 45, 1.50);
		
		System.out.println("Nombre:" + p4.getNombre());
		System.out.println("Edad:" + p4.getEdad());
		System.out.println("Estatura:" + p4.getEstatura());
		
		p = new Persona(); // 2) Instancio un objeto Persona
		//metodo constructor de la clase para crear
		
		
		// 3) Accedo a los atributos
		System.out.println("Nombre:" + p.getNombre());
		System.out.println("Edad:" + p.getEdad());
		System.out.println("Estatura:" + p.getEstatura());

		// 4) Modificar atributos
		p.setNombre("Mario");
		p.setEdad(17);
		p.setEstatura(1.68);

		p2.setNombre("Angelina");

		// 5) Accedo a los atributos
		System.out.println("------------");
		System.out.println("Nombre:" + p.getNombre());
		System.out.println("Edad:" + p.getEdad());
		System.out.println("Estatura:" + p.getEstatura());

		System.out.println("**********");
		System.out.println("p.nombre:" + p.getNombre());
		System.out.println("p2.nombre:" + p2.getNombre());
	}

}
