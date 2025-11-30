package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver"); //link conexion, usuario, contraseña
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "c0tton14");
			System.out.println("conexion exitosa");
			ps = connection.prepareStatement("insert into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos,estatura,cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
					+ "			values(?,?,?,?,?,?,?,?,?)"); //? numeradas desde 1
			
			//INSERTA VALOR .SET(TIPOVALOR), EN ESTE CASO STRING (POSICION, STRING)
			ps.setString(1, "1752724710");
			ps.setString(2, "Rosalia");
			ps.setString(3, "Andrade");
			ps.setString(4, "S");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.34));
			
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
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, timeSQL);
				
				ps.executeUpdate();
				System.out.println("executa insert");
				
			} catch (ParseException e) {
				e.printStackTrace();
			} 
	
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
