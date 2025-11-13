package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	// CONSTRUCTOR
	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas = new ArrayList<Nota>();
	}
	// GET SET
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	// METODOS
	public void agregarNota(Nota nuevaNota) {
		Nota elmNota;
		
		if(nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
			System.out.println("No se puede agregar la nota. Deber ser un numero entre 0 y 10");
			return;
		}
		
		for(int i=0;i<notas.size();i++) {
			elmNota = notas.get(i);
			if(nuevaNota.getMateria().getCodigo().equals(elmNota.getMateria().getCodigo())) {
				System.out.println("Ya existe la nota en la materia");
				return;
			}
		}
		
		notas.add(nuevaNota);
	}
	
	public void modificarNota(String codigo, double nuevaCalificacion) {
		Nota elmNota;
		boolean codigoEncontrado = false;
		
		if(nuevaCalificacion < 0 || nuevaCalificacion > 10) {
			System.out.println("No se puede modificar la nota. Deber ser un numero entre 0 y 10");
			return;
		}
		
		for(int i=0;i<notas.size();i++) {
			elmNota = notas.get(i);
			if(codigo.equals(elmNota.getMateria().getCodigo())) {
				elmNota.setCalificacion(nuevaCalificacion);
				codigoEncontrado = true;
				return;
			}
		}
		
		if(codigoEncontrado==false) {
			System.out.println("No se encontró el codigo");
		}
	}
	
	
	public double calcularPromedioNotasEstudiante() {
		double sumaNotas = 0;
		double promedio = 0;
		
		for(int i=0;i<notas.size();i++) {
			sumaNotas += notas.get(i).getCalificacion();
		}
		
		promedio = sumaNotas/notas.size();
		
		return promedio;
	}
	
	public void mostrar() {
		System.out.println("Estudiante [Nombre = " + nombre + ", Apellido = " + apellido + ", Cedula: " + cedula);
		for(int i=0;i<notas.size();i++) {
			notas.get(i).mostrar();
		}
	}
	
	
	
}
