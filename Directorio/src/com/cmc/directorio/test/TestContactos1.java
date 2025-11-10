package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telef1 = new Telefono(5, "Movi", "0998028202");
		Telefono telef2 = new Telefono(2, "Claro", "0998028203");
		Contacto c1 = new Contacto("Ana", "Plaza", telef1, 50);
		Contacto c2 = new Contacto("Caro", "Muñoz", telef2, 55);
		AdminContactos adminCon = new AdminContactos();
		
		Contacto conMasPesado = adminCon.buscarMasPesados(c1, c2);
		
		System.out.println("---Contacto Más Pesado---\n" 
				+ "Nombre: " + conMasPesado.getNombre() + "\n"
				+ "Apellido: " + conMasPesado.getApellido() + "\n"
				+ "Operadora: " + conMasPesado.getTelefono().getOperadora() + "\n"
				+ "Numero: " + conMasPesado.getTelefono().getNumero() + "\n"
				+ "Peso: " + conMasPesado.getPeso());
		
		boolean compararOperadoras = adminCon.compararOperadoras(c1, c2);
		System.out.println("Las operadoras son las mismas?: "+ compararOperadoras);
		

	}

}
