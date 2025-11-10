package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono(5, "Movi", "0998028202");
		Contacto c = new Contacto("Ana", "Plaza", telef, 50);
		
		
		System.out.println("---Contacto creado---\n" 
		+ "Nombre: " + c.getNombre() + "\n"
		+ "Apellido: " + c.getApellido() + "\n"
		+ "Operadora: " + c.getTelefono().getOperadora() + "\n"
		+ "Nombre: " + c.getNombre());

	}

}
