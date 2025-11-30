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

public class TestConexion2 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "c0tton14");
			System.out.println("Conexion existosa");
			
			ps = connection.prepareStatement("insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)"
					+ "values(?,?,?,?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "14789");
			ps.setBigDecimal(3, new BigDecimal(785.12));
			ps.setString(4, "C");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2025/11/21 08:00:00";
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
				
				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);
				
				ps.executeUpdate();
				
			} catch (ParseException e) {
				e.printStackTrace();
			} 
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
