package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono(2,"Movi","098234234");
		Telefono t2 = new Telefono(3,"Claro","098234234");
		Telefono t3 = new Telefono(4,"Movi","098234234");
		
		AdminTelefono at = new AdminTelefono();
		int cuantosMovi = at.contarMovi(t1, t2, t3);
		
		System.out.println("De los 3 telefono, " + cuantosMovi + " son Movi");
		

	}

}
