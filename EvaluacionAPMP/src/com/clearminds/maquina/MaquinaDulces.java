package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

	public void configurarMaquina(String codigoC1, String codigoC2, String codigoC3, String codigoC4) {
		celda1 = new Celda(codigoC1);
		celda2 = new Celda(codigoC2);
		celda3 = new Celda(codigoC3);
		celda4 = new Celda(codigoC4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("---Codigos Celdas---\n"
				+ "Celda 1: " + celda1.getCodigo() +"\n"
				+ "Celda 2: " + celda2.getCodigo() +"\n"
				+ "Celda 3: " + celda3.getCodigo() +"\n"
				+ "Celda 4: " + celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada;
		if(codigo == celda1.getCodigo()) {
			celdaEncontrada = celda1;
		}else if(codigo == celda2.getCodigo()) {
			celdaEncontrada = celda2;
		}else if(codigo == celda3.getCodigo()) {
			celdaEncontrada = celda3;
		}else if(codigo == celda4.getCodigo()) {
			celdaEncontrada = celda4;
		}else {
			celdaEncontrada = null;
		}
		return celdaEncontrada;
	}
	
	public void cargarProducto(Producto producto, String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, items);
	}
	
	public void mostrarProductos() {
		if(celda1.getProducto() == null) {
			System.out.println("---Productos Celdas---\n"
					+ "****Celda 1****\n"
					+ "La celda no tiene producto\n"
					+ "Stock: " + celda1.getStock() + "\n"
					);
		}else {
			System.out.println("---Productos Celdas---\n"
					+ "****Celda 1****\n"
					+ "Codigo: " + celda1.getProducto().getCodigo() + "\n"
					+ "Stock: " + celda1.getStock() + "\n"
					+ "Nombre Producto: " + celda1.getProducto().getNombre() + "\n"
					+ "Precio Producto: " + celda1.getProducto().getPrecio() + "\n"
					);
		}
		
		if(celda2.getProducto() == null) {
			System.out.println("****Celda 2****\n"
					+ "La celda no tiene producto\n"
					+ "Stock: " + celda2.getStock() + "\n"
					);
		}else {
			System.out.println("****Celda 2****\n"
					+ "Codigo: " + celda2.getProducto().getCodigo() + "\n"
					+ "Stock: " + celda2.getStock() + "\n"
					+ "Nombre Producto: " + celda2.getProducto().getNombre() + "\n"
					+ "Precio Producto: " + celda2.getProducto().getPrecio() + "\n"
					);
		}
		
		if(celda3.getProducto() == null) {
			System.out.println("****Celda 3****\n"
					+ "La celda no tiene producto\n"
					+ "Stock: " + celda3.getStock() + "\n"
					);
		}else {
			System.out.println("****Celda 3****\n"
					+ "Codigo: " + celda3.getProducto().getCodigo() + "\n"
					+ "Stock: " + celda3.getStock() + "\n"
					+ "Nombre Producto: " + celda3.getProducto().getNombre() + "\n"
					+ "Precio Producto: " + celda3.getProducto().getPrecio() + "\n"
					);
		}
		
		if(celda4.getProducto() == null) {
			System.out.println("****Celda 4****\n"
					+ "La celda no tiene producto\n"
					+ "Stock: " + celda4.getStock() + "\n"
					);
		}else {
			System.out.println("****Celda 4****\n"
					+ "Codigo: " + celda4.getProducto().getCodigo() + "\n"
					+ "Stock: " + celda4.getStock() + "\n"
					+ "Nombre Producto: " + celda4.getProducto().getNombre() + "\n"
					+ "Precio Producto: " + celda4.getProducto().getPrecio() + "\n"
					);
		}
		
		System.out.println("Saldo: " + saldo);
		
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Producto productoEncontrado;
		if(codigo == celda1.getCodigo()) {
			productoEncontrado = celda1.getProducto();
		}else if(codigo == celda2.getCodigo()) {
			productoEncontrado = celda2.getProducto();
		}else if(codigo == celda3.getCodigo()) {
			productoEncontrado = celda3.getProducto();
		}else if(codigo == celda4.getCodigo()) {
			productoEncontrado = celda4.getProducto();
		}else {
			productoEncontrado = null;
		}
		return productoEncontrado;
	}
	
	public double consultarPrecio(String codigo) {
		
		double precioEncontrado = 0;
		
		if(codigo == celda1.getCodigo()) {
			precioEncontrado = celda1.getProducto().getPrecio();
		}else if(codigo == celda2.getCodigo()) {
			precioEncontrado = celda2.getProducto().getPrecio();;
		}else if(codigo == celda3.getCodigo()) {
			precioEncontrado = celda3.getProducto().getPrecio();;
		}else if(codigo == celda4.getCodigo()) {
			precioEncontrado = celda4.getProducto().getPrecio();;
		}
		return precioEncontrado;
		
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda celdaEncontrado;
		if(celda1.getProducto() != null && codigoProducto == celda1.getProducto().getCodigo()) {
			celdaEncontrado = celda1;
		}else if(celda2.getProducto() != null && codigoProducto == celda2.getProducto().getCodigo()) {
			celdaEncontrado = celda2;
		}else if(celda3.getProducto() != null && codigoProducto == celda3.getProducto().getCodigo()) {
			celdaEncontrado = celda3;
		}else if(celda4.getProducto() != null && codigoProducto == celda4.getProducto().getCodigo()) {
			celdaEncontrado = celda4;
		}else {
			celdaEncontrado = null;
		}
		
		
		
		return celdaEncontrado;
	}
	
	public void incrementarProductos(String codigoProducto, int itemsInc) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		int itemsTotal = celdaEncontrada.getStock() + itemsInc;
		celdaEncontrada.setStock(itemsTotal);
	}
	
	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int stockTotal = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(stockTotal);
		
		saldo += celdaEncontrada.getProducto().getPrecio();
		
	}
	
	public double venderConCambio(String codigo, double valor) {
		double cambio = 0;
		Celda celdaEncontrada = buscarCelda(codigo);
		int stockTotal = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(stockTotal);
		cambio = valor - saldo;
		saldo += celdaEncontrada.getProducto().getPrecio();
		
		
		return cambio;
	}


	
	
	
}
