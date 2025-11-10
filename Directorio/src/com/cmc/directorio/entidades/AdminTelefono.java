package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora() == "Movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int sonMovi = 0;
		if(t1.getOperadora() == "Movi") {
			sonMovi += 1;
		}
		
		if(t2.getOperadora() == "Movi") {
			sonMovi += 1;
		}
		
		if(t3.getOperadora() == "Movi") {
			sonMovi += 1;
		}
		return sonMovi;
	}
	
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3,Telefono t4) {
		int sonClaro = 0;
		if(t1.getOperadora() == "Claro") {
			sonClaro += 1;
		}
		
		if(t2.getOperadora() == "Claro") {
			sonClaro += 1;
		}
		
		if(t3.getOperadora() == "Claro") {
			sonClaro += 1;
		}
		
		if(t4.getOperadora() == "Claro") {
			sonClaro += 1;
		}
		
		return sonClaro;
	}
	
	
}
