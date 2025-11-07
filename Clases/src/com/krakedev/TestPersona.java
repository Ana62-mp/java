package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1) declaro variable p de tipo Persona
		Persona p2 = new Persona();

		p = new Persona(); // 2) Instancio un objeto Persona

		// 3) Accedo a los atributos
		System.out.println("Nombre:" + p.nombre);
		System.out.println("Edad:" + p.edad);
		System.out.println("Estatura:" + p.estatura);

		// 4) Modificar atributos
		p.nombre = "Mario";
		p.edad = 17;
		p.estatura = 1.68;

		p2.nombre = "Angelina";

		// 5) Accedo a los atributos
		System.out.println("------------");
		System.out.println("Nombre:" + p.nombre);
		System.out.println("Edad:" + p.edad);
		System.out.println("Estatura:" + p.estatura);

		System.out.println("**********");
		System.out.println("p.nombre:" + p.nombre);
		System.out.println("p2.nombre:" + p2.nombre);
	}

}
