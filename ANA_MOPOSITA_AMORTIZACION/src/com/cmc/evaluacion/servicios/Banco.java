package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Cliente> clientes;
	public Banco() {
		clientes = new ArrayList<Cliente>();
	}
	//GET Y SET
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	//METODOS
	public Cliente buscarCliente(String cedula) {
		Cliente clienteEncontrado = null;
		for(Cliente cliente:clientes) {
			if(cliente != null && cedula.equals(cliente.getCedula())) {
				clienteEncontrado = cliente;
			}
		}
		return clienteEncontrado;
	}
	
	
	public void registrarCliente(Cliente cliente) {
		if(buscarCliente(cliente.getCedula())==null) {
			clientes.add(cliente);
		}else {
			System.out.println("Cliente ya existe: " + cliente.getCedula());
		}
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente cliente = buscarCliente(cedula);
		if(cliente!=null) {
			CalculadoraAmortizacion.generarTabla(prestamo);
	        cliente.getPrestamos().add(prestamo);
		}else {
			System.out.println(cedula + " | No es cliente del banco");
		}
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		Cliente cliente = buscarCliente(cedula);
		if(cliente!=null) {
			ArrayList<Prestamo> prestamosCliente = cliente.getPrestamos();
			if(prestamosCliente !=null && !prestamosCliente.isEmpty()) {
				return prestamosCliente;
			}
			else {
				System.out.println("El cliente C.I. " + cedula + " no tiene prestamos");
				return null;
			}
		}else {
			System.out.println(cedula + " | No es cliente del banco");
			return null;
		}
	}
	

	
}
