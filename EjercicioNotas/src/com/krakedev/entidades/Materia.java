package com.krakedev.entidades;

public class Materia {
	private String codigo;
	private String nombre;
	
	
	//CONSTRUCTOR
	public Materia(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	//GET SET
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//METODOS
	
	
}
