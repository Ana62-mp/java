package com.krakedev;

public class Persona {
	private String nombre;
	private int edad;
	private double estatura;
	
	public Persona(){
		System.out.println("ingresa a constructor");
	}
	
	//el constructor ya no lo pone java cuando creamos más
	//por ello tenemos que agregarlo o, en este caso mantenerlo
	
	public Persona(String nombre){
		this.nombre = nombre;
	}
	public Persona(String nombre, int edad, double estatura){
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	//metodos con el mismo nombre (incluso de clase)
	//siempre y cuando tengan diferentes parámetros
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	
}
