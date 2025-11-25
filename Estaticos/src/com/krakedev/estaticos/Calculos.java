package com.krakedev.estaticos;

public class Calculos {
	/* private double iva = 12; //iva aun no es constante porque valor es reasignable */
	private final double IVA = 12; //con final si es constante (no se puede cambiar)
	
	//final tampoco se puede hace get y set, es decir, son solo usables internamente en clase
	//como buena práctica cons con MAYÚSCULA
	
	public double calcularIva(double monto) {
		return monto*IVA/100;
	}
}
