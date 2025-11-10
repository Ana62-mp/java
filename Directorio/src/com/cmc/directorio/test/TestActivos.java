package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telefono = new Telefono(5, "Movi", "0998028202");
		Contacto c = new Contacto("Ana", "Plaza", telefono, 50);
		AdminContactos adminCon = new AdminContactos();
		
		System.out.println("Codigo: " + c.getTelefono().getCodigo() + "\n"
				+ "Operadora: " + c.getTelefono().getOperadora() + "\n"
				+ "Numero: " + c.getTelefono().getNumero() + "\n"
				+ "Tiene Whatsapp: " + c.getTelefono().isTieneWhatsapp());
		
		adminCon.activarUsuario(c);
		
		System.out.println("---Después de activar cuando Tiene whats es FALSE\n"
				+ "Nombre: " + c.getNombre() + "\n"
				+ "Apellido: " + c.getApellido() + "\n"
				+ "Peso: " + c.getPeso() + "\n"
				+ "Tiene Whatsapp: " + c.getTelefono().isTieneWhatsapp() + "\n"
				+ "Activo: " + c.isActivo() + "\n"
				//Se mantiene false
				);
		
		
		

	}

}
