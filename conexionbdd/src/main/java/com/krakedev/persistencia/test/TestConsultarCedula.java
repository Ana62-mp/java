package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultarCedula {

	public static void main(String[] args) {
		try {
			Persona per = AdminPersonas.buscarPorCedula("1111111111");
			System.out.println(per);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
