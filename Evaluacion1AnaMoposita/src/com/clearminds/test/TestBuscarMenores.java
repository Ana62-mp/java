package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		ArrayList<Producto> buscarMenores = new ArrayList<Producto>(); 
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("A3"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("B3"));
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D456","Doritos",1.75);
		maquina.cargarProducto(producto2, "A2", 6);
		
		Producto producto3=new Producto("K1","Biribiri",4.78);
		maquina.cargarProducto(producto3, "A3", 5);
		
		Producto producto4=new Producto("K2","Chocolate",0.50);
		maquina.cargarProducto(producto4, "B1", 12);
		
		Producto producto5=new Producto("K3","Tostitos",3.45);
		maquina.cargarProducto(producto5, "B2", 5);
		
		Producto producto6=new Producto("K4","Gomitas",1.87);
		maquina.cargarProducto(producto6, "B3", 8);
		
		
		buscarMenores = maquina.buscarMenores(2);
		System.out.println("Productos Menores: " + buscarMenores.size());
		Producto elmProducto;
		for(int i=0;i<buscarMenores.size();i++) {
			elmProducto = buscarMenores.get(i);
			System.out.println("Nombre: " + elmProducto.getNombre() + " | Precio: " + elmProducto.getPrecio());
		}
		

		

	}

}
