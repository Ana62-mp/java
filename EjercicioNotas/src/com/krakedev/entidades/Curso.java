package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}
	
	// GET SET
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	//METODOS
	
	public Estudiante buscarEstudiantesPorCedula(Estudiante estudiante) {
		Estudiante elmEstudiante;
		Estudiante estudianteEnc = null;
		for(int i=0;i<estudiantes.size();i++) {
			elmEstudiante = estudiantes.get(i);
			if(estudiante.getCedula().equals(elmEstudiante.getCedula())) {
				System.out.println("El estudiante si está dentro del curso");
				estudianteEnc = elmEstudiante;
			}
		}
		
		return estudianteEnc;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		if(buscarEstudiantesPorCedula(estudiante) == null) {
			estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		double sumaPromedios = 0;
		double promedio = 0;
		
		for(int i=0;i<estudiantes.size();i++) {
			sumaPromedios += estudiantes.get(i).calcularPromedioNotasEstudiante();
		}
		
		promedio = sumaPromedios/estudiantes.size();
		
		return promedio;
	}
	
	public void mostrar() {
		System.out.println("Curso [Estudiantes]");
		for(int i=0;i<estudiantes.size();i++) {
			estudiantes.get(i).mostrar();
		}
	}
	
	
	
}
