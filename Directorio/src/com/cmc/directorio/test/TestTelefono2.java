package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telef = new Telefono(20,"Movi","098234234");
		AdminTelefono at = new AdminTelefono();
		
		at.activarMensajeria(telef);
		
		System.out.println("Info telef\n"
				+ "Operadora: " + telef.getOperadora() + "\n"
				+ "Numero: " + telef.getNumero() + "\n"
				+ "Codigo: " + telef.getCodigo() + "\n"
				+ "Whatsapp: " + telef.isTieneWhatsapp());
		
		

	}

}
