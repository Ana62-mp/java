package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono(2,"Movi","098234234");
		Telefono t2 = new Telefono(3,"Claro","098234234");
		Telefono t3 = new Telefono(4,"Claro","098234234");
		Telefono t4 = new Telefono(4,"Claro","098234234");
		AdminTelefono at = new AdminTelefono();
		
		int cuantosClaro = at.contarClaro(t1, t2, t3, t4);
		
		System.out.println("De los 4 telefono, " + cuantosClaro + " son Claro");

	}

}
