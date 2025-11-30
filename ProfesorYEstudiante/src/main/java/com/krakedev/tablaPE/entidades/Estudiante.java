package com.krakedev.tablaPE.entidades;

import java.util.Date;

public class Estudiante {
	private String cedula ;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNac;
	private int codigoProf;
	
	public Estudiante(String cedula, String nombre, String apellido, String email, Date fechaNac, int codigoProf) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNac = fechaNac;
		this.codigoProf = codigoProf;
	}
	
	public Estudiante(String cedula, String nombre, String apellido, String email, int codigoProf) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.codigoProf = codigoProf;
	}
	
	public Estudiante(){}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getCodigoProf() {
		return codigoProf;
	}

	public void setCodigoProf(int codigoProf) {
		this.codigoProf = codigoProf;
	}

	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", fechaNac=" + fechaNac + ", codigoProf=" + codigoProf + "]";
	}
	
	
	
	
	
}
