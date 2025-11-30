package com.krakedev.tablaPE.test;

import com.krakedev.tablaPE.servicios.AdminProfEstu;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminProfEstu.eliminar("1752724748");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
