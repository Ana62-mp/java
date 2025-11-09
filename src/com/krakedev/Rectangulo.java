package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	
	public int calcularArea() { //no recibe parametros porque tiene atributos
		int area = base*altura;
		return area;
		
	}
	
	public double calcularPerimetro() {
		double perimetro = (2*base) + (2*altura);
		return perimetro;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
