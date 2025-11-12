package com.clearminds.componentes;

public class Producto {
	private String Nombre;
	private double precio;
	private String codigo;
	
	
	public Producto(String codigo, String nombre, double precio) {
		Nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}

	public void incrementarPrecio(int porcentajeInc) {
		double porcentaje = (porcentajeInc * precio)/100;
		precio += porcentaje;
	}
	
	public void disminuirPrecio(double porcentajeDesc) {
		precio -= porcentajeDesc;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
