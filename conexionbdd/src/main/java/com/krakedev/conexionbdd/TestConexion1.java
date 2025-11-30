package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion1 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "c0tton14");
			System.out.println("Conexion existosa");
			
			ps = connection.prepareStatement("insert into productos(codigo,nombre,descripcion,precio,stock)"
					+ "values(?,?,?,?,?)");
			
			ps.setInt(1, 6);
			ps.setString(2, "Jabón");
			ps.setString(3, "Olor a miel y chocolate");
			ps.setBigDecimal(4, new BigDecimal(6.78));
			ps.setInt(5,34);
			
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
