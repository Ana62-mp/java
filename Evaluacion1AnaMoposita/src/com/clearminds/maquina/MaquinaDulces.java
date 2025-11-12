package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	//CONSTRUCTOR
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	
	
	//METODOS
	
	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}
	
	public void mostrarConfiguracion() {
		Celda elmCelda;
		for(int i=0;i<celdas.size();i++) {
			elmCelda = celdas.get(i);
			System.out.println("Celda " + (i+1) +": " + elmCelda.getCodigo());
		}
	}
	
	public Celda buscarCelda(String codigoCelda) {
		Celda celdaEncontrada = null;
		Celda elmCelda;
		for(int i=0;i<celdas.size();i++) {
			elmCelda = celdas.get(i);
			if(codigoCelda.equals(elmCelda.getCodigo())) {
				celdaEncontrada = elmCelda;
			}
		}
		return celdaEncontrada;
	}
	
	public void cargarProducto(Producto producto, String codigoCelda, int stock) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, stock);
	}
	
	public void mostrarProductos() {
		Celda elmCelda;
		for(int i=0;i<celdas.size();i++) {
			elmCelda = celdas.get(i);
			if(elmCelda.getProducto() != null) {
				System.out.println("Celda: " + elmCelda.getCodigo() 
				+ " | Stock: " + elmCelda.getStock() + " | Producto:" + elmCelda.getProducto().getCodigo()
				+ " | Precio:" + elmCelda.getProducto().getPrecio());
			}else {
				System.out.println("Celda: " + elmCelda.getCodigo() 
				+ " | Stock: " + elmCelda.getStock() + " | Sin producto asignado");
			}
		}
		System.out.println("Saldo Maquina: " + saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Producto productoEncontrado = null;
		Celda elmCelda;
		
		for(int i=0;i<celdas.size();i++) {
			elmCelda = celdas.get(i);
			if(codigoCelda.equals(elmCelda.getCodigo())) {
				productoEncontrado = elmCelda.getProducto();
			}
		}
		
		return productoEncontrado;
	}
	
	public double consultarPrecio(String codigoCelda) {
		double precio = 0;
		Celda elmCelda;
		for(int i=0;i<celdas.size();i++) {
			elmCelda = celdas.get(i);
			if(codigoCelda.equals(elmCelda.getCodigo())) {
				precio = elmCelda.getProducto().getPrecio();
			}
			
		}
		
		return precio;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda celdaEncontrada = null;
		Celda elmCelda;
		for(int i=0;i<celdas.size();i++) {
			elmCelda = celdas.get(i);
			if(elmCelda.getProducto() != null && codigoProducto.equals(elmCelda.getProducto().getCodigo())) {
				celdaEncontrada = elmCelda;
			}
		}
		
		return celdaEncontrada;
	}
	
	
	public void incrementarProductos(String codigoProducto, int stockInc) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		int stockTotal = celdaEncontrada.getStock() + stockInc;
		celdaEncontrada.setStock(stockTotal);
		
	}
	
	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		
		int stockTotal = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(stockTotal);
		
		saldo += celdaEncontrada.getProducto().getPrecio();
		
		
	}
	
	public double venderConCambio(String codigoCelda, double valorCliente) {
		double cambio;
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		
		int stockTotal = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(stockTotal);
		saldo = celdaEncontrada.getProducto().getPrecio();
		cambio = valorCliente - saldo;
		System.out.println("Su cambio es de: " + cambio);
		
		return cambio;
		
	}
	
	
	public ArrayList<Producto> buscarMenores(double limite){
		Celda elmCelda;
		ArrayList<Producto> productosMenores = new ArrayList<Producto>();		
		for(int i=0;i<celdas.size();i++) {
			elmCelda = celdas.get(i);
			if(elmCelda.getProducto() != null && elmCelda.getProducto().getPrecio() <= limite) {
				productosMenores.add(elmCelda.getProducto());
			}
		}
		
		return productosMenores;
	}
	

	
	
	
	
	
	
}
