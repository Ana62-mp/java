package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		double areaC1;
		double areaC2;
		double areaC3;
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;
		
		c1.setLado(4);
		c2.setLado(5);
		c3.setLado(3);
		
		areaC1 = c1.calcularArea();
		areaC2 = c2.calcularArea();
		areaC3 = c3.calcularArea();
		
		perimetroC1 = c1.calcularPerimetro();
		perimetroC2 = c2.calcularPerimetro();
		perimetroC3 = c3.calcularPerimetro();
		
		System.out.println("AREA C1: " + areaC1);
		System.out.println("AREA C2: " + areaC2);
		System.out.println("AREA C3: " + areaC3);
		System.out.println("PERIMETRO C1: " + perimetroC1);
		System.out.println("PERIMETRO C2: " + perimetroC2);
		System.out.println("PERIMETRO C3: " + perimetroC3);
	}

}
