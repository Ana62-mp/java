package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		//Date - java.util.Date
		//Date - java.sql.Date
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr = "2020/03/22 10:05:09";
		try {
			//convierte de String a Date.util
			Date fecha = sdf.parse(fechaStr); //de UTIL
			System.out.println(fecha);
			//(long - bigger ints) toma time en milisegundos para trans 
			long fechaMilis = fecha.getTime();
			System.out.println(fechaMilis);
			//transforma a Date.sql que es la que necesitamos
			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
			System.out.println(fechaSQL);
			
			//Obtiene tiempo de time 
			Time timeSQL = new Time(fechaMilis);
			System.out.println(timeSQL);
			
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		

	}

}
