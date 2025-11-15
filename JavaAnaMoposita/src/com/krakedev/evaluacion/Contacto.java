package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	


	//CONSTRUCTOR
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<Telefono>();
		
			
	}
	
	
	//GET Y SET
	
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	//METODOS
	
	/* public void imprimir() {
		System.out.println("***" + nombre + " " + apellido + "***");
		if(direccion != null) {
			System.out.println("Dirección: " + direccion.getCallePrincipal() 
			+ " y " + direccion.getCalleSecundaria());
			
		}else {
			System.out.println("No tiene asociada una dirección");
		}
	}
	*/
	
	public void imprimir() {
		System.out.println("Información del contacto: ");
		if(direccion != null) {
			System.out.println("Cédula: " + cedula 
			+ "\nNombre:  " + nombre + " " + apellido
			+ "\nDirección:  "
			+ "\n   Calle Principal: " + direccion.getCallePrincipal()
			+ "\n   Calle Principal: " + direccion.getCalleSecundaria());
		}
	}
	
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
		Telefono elmTlf;
		
		System.out.println("Teléfonos con estado 'C':");
		
		for(int i=0;i<telefonos.size();i++) {
			elmTlf = telefonos.get(i);
			if(elmTlf.getEstado().equals("C")) {
				System.out.println("Número: " + elmTlf.getNumero() + ", Tipo: " + elmTlf.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonosInc = new ArrayList<Telefono>();
		Telefono elmTlf;
		for(int i=0;i<telefonos.size();i++) {
			elmTlf = telefonos.get(i);
			if(elmTlf.getEstado().equals("E")) {
				telefonosInc.add(elmTlf);	
			}
		}
		
		return telefonosInc;
	}
	
	
	
}
