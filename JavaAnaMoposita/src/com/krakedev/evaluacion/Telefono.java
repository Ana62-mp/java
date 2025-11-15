package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	//CONSTRUCTOR
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		int error= 0;
		
		if(numero!=null && tipo!=null) {
			if(tipo.equalsIgnoreCase("movil") || tipo.equalsIgnoreCase("convencional")) {
				if(tipo.equalsIgnoreCase("movil")) {
					if(numero.length() != 10) {
						error += 1;
					}
				}else if(tipo.equalsIgnoreCase("convencional")) {
					if(numero.length() != 7) {
						error += 1;
					}
				}
			}else {
				error += 1;
			}
				
		}else {
			error += 1;
		}
		
		if(error != 0) {
			this.estado = "E";
		}else {
			this.estado = "C";
		}
		
		
		
	}
	
	
	//GETTERS
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	
	
	
	
	
}
