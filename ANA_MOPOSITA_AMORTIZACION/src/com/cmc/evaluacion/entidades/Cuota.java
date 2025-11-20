package com.cmc.evaluacion.entidades;

public class Cuota {
	private int numero;
	private double cuota;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	
	
	//CONSTRUCTOR
	public Cuota(int numero) {
		this.numero = numero;
	}
	//GET Y SET
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double capitalInicio) {
		this.inicio = capitalInicio;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//METODOS
	public void mostrarPrestamo() {
		System.out.printf("%-4d | %.2f | %.2f | %.2f | %.2f | %.2f%n",
				numero, cuota, inicio, interes, abonoCapital, saldo);
	}
	
	
	
}
