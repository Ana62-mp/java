package com.krakedev.evaluacion;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	
	//CONSTRUCTOR
	public Direccion(String callePrincipal, String calleSecundaria) {
		super();
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
	}
	
	
	
	//GET Y SET
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
		
	
		
		
		
		
		
	
}
