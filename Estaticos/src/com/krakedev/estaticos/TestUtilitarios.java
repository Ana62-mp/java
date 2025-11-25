package com.krakedev.estaticos;

public class TestUtilitarios {

	public static void main(String[] args) {
		/* 1
		Utilitarios u = new Utilitarios();
		u.validarRango(10); si hacemos esto sigue siendo metodo de objeto
		*/
		boolean u = Utilitarios.validarRango(10);
		System.out.println(u);
		

	}

}
