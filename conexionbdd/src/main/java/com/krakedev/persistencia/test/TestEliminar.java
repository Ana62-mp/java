package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminPersonas.eliminar("1711711711");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error del sistema: " +e.getMessage());
		}

	}

}
