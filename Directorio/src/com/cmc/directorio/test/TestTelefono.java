package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telef = new Telefono(10, "Movi", "09941234123");
		
		System.out.println("Info telef\n"
				+ "Operadora: " + telef.getOperadora() + "\n"
				+ "Numero: " + telef.getNumero() + "\n"
				+ "Codigo: " + telef.getCodigo());
		
		
		
	}

}
