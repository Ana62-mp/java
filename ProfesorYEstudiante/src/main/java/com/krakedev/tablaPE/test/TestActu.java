package com.krakedev.tablaPE.test;

import java.util.Date;

import com.krakedev.tablaPE.entidades.Estudiante;
import com.krakedev.tablaPE.servicios.AdminProfEstu;
import com.krakedev.tablaPE.utils.Convertidor;

public class TestActu {

	public static void main(String[] args) {
		Estudiante es = new Estudiante("1752724748","Ana","Plaza","ana.m@gmail.com", 67);
		try {
			Date fechaNac = Convertidor.convertirFecha("2009/03/14");
			es.setFechaNac(fechaNac);
			AdminProfEstu.actualizar(es);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error del sistema: " +e.getMessage());
		}

	}

}
