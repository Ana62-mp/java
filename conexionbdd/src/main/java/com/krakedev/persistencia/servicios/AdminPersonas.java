package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);
	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar " + persona);
		try {
			//abrir conexion
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("insert into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos,estatura,cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
					+ "			values(?,?,?,?,?,?,?,?,?)"); //? numeradas desde 1
			
			//INSERTA VALOR .SET(TIPOVALOR), EN ESTE CASO STRING (POSICION, STRING)
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstado_civil().getCodigo());
			ps.setInt(5, persona.getNumero_hijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidad_ahorrada());
			ps.setDate(8, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate() ;
			
		} catch (Exception e) {
			//loggear error
			LOGGER.error("Error al insertar",e);
			//SIGO PROPAGANDO EXC HASTA DONDE LO PUEDA MOSTRAR (TEST)
			throw new Exception("Error al insertar");
		}finally {
			//cerrar sesion
			try {
				con.close();
			} catch (SQLException e) { //no conviene solo throw e, mejor crear exc
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
		
	}
	
	
	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a actualizar " + persona);
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("UPDATE personas SET "
					+ "nombre=?, "				 
					+ "apellido=?, "			
					+ "estado_civil_codigo=?, "	 
					+ "numero_hijos=?, "		
					+ "estatura=?, "			 
					+ "cantidad_ahorrada=?, "	
					+ "fecha_nacimiento=?, "	
					+ "hora_nacimiento=? "		
					+ "WHERE cedula=?"); 
			
			//INSERTA VALOR .SET(TIPOVALOR), EN ESTE CASO STRING (POSICION, STRING)
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstado_civil().getCodigo());
			ps.setInt(4, persona.getNumero_hijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidad_ahorrada());
			ps.setDate(7, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());
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
		LOGGER.trace("Persona a eliminar con cedula " + cedula);
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("DELETE FROM personas WHERE cedula = ?"); 
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
	
	
	
	public static ArrayList<Persona> buscarPorNombre(String nombreB) throws Exception {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%"+nombreB+"%");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				Persona p = new Persona();
				p.setNombre(nombre);
				p.setCedula(cedula);
				personas.add(p);					
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre",e);
			throw new Exception("Error al consultar por nombre");
		}finally {
			try {
				con.close();
			} catch (SQLException e) { 
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return personas;
	}
	
	public static Persona buscarPorCedula(String cedula) throws Exception {
		Persona persona = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where cedula = ?");
			ps.setString(1, cedula);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				persona = new Persona();
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				persona.setCedula(cedula);
				persona.setNombre(nombre);
				persona.setApellido(apellido);
								
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por cedula",e);
			throw new Exception("Error al consultar por cedula");
		}finally {
			try {
				con.close();
			} catch (SQLException e) { 
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return persona;
	}
	
	public static ArrayList<Persona> buscarPorMontoMenorA(BigDecimal monto) throws Exception {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("SELECT *, cantidad_ahorrada::money::numeric AS cantidad_ahorrada_num FROM personas WHERE cantidad_ahorrada::money::numeric < ?");
			ps.setBigDecimal(1, monto);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				BigDecimal cantidad_ahorrada = rs.getBigDecimal("cantidad_ahorrada_num");
				Persona p = new Persona();
				p.setNombre(nombre);
				p.setCedula(cedula);
				p.setCantidad_ahorrada(cantidad_ahorrada);
				personas.add(p);					
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por cantidad ahorrada",e);
			throw new Exception("Error al consultar por cantidad ahorrada");
		}finally {
			try {
				con.close();
			} catch (SQLException e) { 
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return personas;
	}
	

}
