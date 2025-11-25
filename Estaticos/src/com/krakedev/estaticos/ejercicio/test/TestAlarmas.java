package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		AdminAlarmas adminAla = new AdminAlarmas();		
		Alarma a1 = new Alarma(DiasSemana.DOMINGO,5,30);
		Alarma a2 = new Alarma(DiasSemana.SABADO,6,30);
		Alarma a3 = new Alarma(DiasSemana.LUNES,8,3);
		Alarma a4 = new Alarma(DiasSemana.VIERNES,14,30);
		
		adminAla.agregarAlarma(a1);
		adminAla.agregarAlarma(a2);
		adminAla.agregarAlarma(a3);
		adminAla.agregarAlarma(a4);
		
		ArrayList<Alarma> alarmasActuales = adminAla.getAlarmas();
		System.out.println(alarmasActuales);
		
	}

}
