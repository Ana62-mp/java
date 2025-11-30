package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

//System.out.println solo se puede usar en TESTS
public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U","Union Libre");
		Persona p = new Persona("1748956474","Julio","Jaramillo",ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2020/04/12");
			Date horaNac = Convertidor.convertirHora("08:45:50");
			
			p.setFecha_nacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidad_ahorrada(new BigDecimal(1230.45));
			p.setNumero_hijos(50);
			AdminPersonas.insertar(p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error del sistema: " +e.getMessage());
		}

		

	}

}
