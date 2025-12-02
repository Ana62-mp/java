package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultarCantidadAhorrada {

	public static void main(String[] args) {
		BigDecimal monto = new BigDecimal(600);
		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorMontoMenorA(monto);
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
