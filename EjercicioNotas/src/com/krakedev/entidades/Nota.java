package com.krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;
	
	//CONSTRUCTOR
	public Nota(Materia materia, double calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
	}
	//GET SET
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
	//METODOS
	public void mostrar() {
		System.out.println("Nota [Materia = " + materia.getNombre() + " | " + materia.getCodigo() + ", Calificacion = " + calificacion);
	}
	
	
}
