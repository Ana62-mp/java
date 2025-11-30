package com.krakedev.tablaPE.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.tablaPE.entidades.Estudiante;
import com.krakedev.tablaPE.utils.ConexionBDD;

public class AdminProfEstu {
	private static final Logger LOGGER = LogManager.getLogger(AdminProfEstu.class);
	
	public static void insertar(Estudiante estudiante) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Estudiante a insertar " + estudiante);
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("insert into estudiantes(cedula, nombre, apellido, email, fecha_nacimiento,codigo_profesor)"
					+ "			values(?,?,?,?,?,?)"); //? numeradas desde 1
			
			//INSERTA VALOR .SET(TIPOVALOR), EN ESTE CASO STRING (POSICION, STRING)
			ps.setString(1, estudiante.getCedula());
			ps.setString(2, estudiante.getNombre());
			ps.setString(3, estudiante.getApellido());
			ps.setString(4, estudiante.getEmail());
			ps.setDate(5, new java.sql.Date(estudiante.getFechaNac().getTime()));
			ps.setInt(6, estudiante.getCodigoProf());
			ps.executeUpdate() ;
			
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
		}finally {
			try {
				con.close();
			} catch (SQLException e) { 
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
		
	}
	
	
	public static void actualizar(Estudiante estudiante) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Estudiante a actualizar " + estudiante);
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("UPDATE estudiantes SET "
					+ "nombre=?, "				 
					+ "apellido=?, "
					+ "email=?, "			
					+ "fecha_nacimiento=?, "
					+ "codigo_profesor=? "	
					+ "WHERE cedula=?"); 
			
			ps.setString(1, estudiante.getNombre());
			ps.setString(2, estudiante.getApellido());
			ps.setString(3, estudiante.getEmail());
			ps.setDate(4, new java.sql.Date(estudiante.getFechaNac().getTime()));
			ps.setInt(5, estudiante.getCodigoProf());
			ps.setString(6, estudiante.getCedula());
			ps.executeUpdate() ;
			
		} catch (Exception e) {
			LOGGER.error("Error al actualizar",e);
			throw new Exception("Error al actualizar");
		}finally {
			try {
				con.close();
			} catch (SQLException e) { 
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		
		
	}
	
	public static void eliminar(String cedula) throws Exception{
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Estudiante a eliminar con cedula " + cedula);
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("DELETE FROM estudiantes WHERE cedula = ?"); 
			ps.setString(1, cedula);
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al eliminar",e);
			throw new Exception("Error al eliminar");
		}finally {
			try {
				con.close();
			} catch (SQLException e) { 
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		
	}
	
	
	
	
}
