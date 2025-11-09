package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosVendidos;
	private int productosDevueltos;
	
	public Item(String nombre) {
		this.nombre = nombre;
	}
	
	public void imprimir() {
		System.out.println("Nombre Producto: "+ nombre + "\n"
				+ "Productos Actuales: " + productosActuales + "\n"
				+ "Productos Vendidos: " + productosVendidos + "\n"
				+ "Productos Devueltos: " + productosDevueltos);
	}
	
	public void vender(int cantidadVendida) {
		productosActuales -= cantidadVendida;
		productosVendidos += cantidadVendida;
	}
	
	public void devolver(int cantidadDevuelta) {
		productosActuales += cantidadDevuelta;
		productosDevueltos += cantidadDevuelta;
		productosVendidos -= cantidadDevuelta; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	
	
	
	
}
