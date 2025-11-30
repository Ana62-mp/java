package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("C","Casado");
		Persona p = new Persona("1748956474","Alexis","Jaramillo",ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("1975/04/12");
			Date horaNac = Convertidor.convertirHora("18:45:50");
			
			p.setFecha_nacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidad_ahorrada(new BigDecimal(548.21));
			p.setNumero_hijos(2);
			AdminPersonas.actualizar(p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error del sistema: " +e.getMessage());
		}

		

	}

}
