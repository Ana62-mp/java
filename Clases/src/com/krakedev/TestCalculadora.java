package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMulti;
		double resultadoDivision;
		double resultadoPromedio;
		
		calcu = new Calculadora();
		resultadoSuma = calcu.suma(5, 3);
		resultadoResta = calcu.restar(10, 3);
		resultadoMulti = calcu.multiplicar(10, 5);
		resultadoDivision = calcu.division(10, 2);
		resultadoPromedio = calcu.promediar(10, 8,9);
		
		
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMulti);
		System.out.println("RESULTADO DIVISION: "+resultadoDivision);
		System.out.println("RESULTADO PROMEDIO: "+resultadoPromedio);
		calcu.mostrarResultado();
		
	}

}
