package com.krakedev.estaticos;

public class Utilitarios {
	public static boolean validarRango(int valor) { //2 pongo static para hacerlo estático, pertenezca a clase
		if(valor >= 0 && valor<= 10) {
			return true;
		}else {
			return false;
		}
	}
}
