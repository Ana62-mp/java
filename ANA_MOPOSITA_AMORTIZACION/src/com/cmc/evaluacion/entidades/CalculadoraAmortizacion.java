package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double interesPeriodo = (prestamo.getInteres()/12)/100;
		double parteCuota = Math.pow((1+interesPeriodo), -prestamo.getPlazo());
		double monto = prestamo.getMonto();
		double cuota = (monto*interesPeriodo)/(1-parteCuota);
		
		return cuota;
	}
	
	
	public static void generarTabla(Prestamo prestamo) {
		double valorCuota = calcularCuota(prestamo);
		int plazo = prestamo.getPlazo();
		double interesAnual = prestamo.getInteres();
		ArrayList<Cuota> cuotas = prestamo.getCuotas();
		
		for(int i = 0;i<plazo;i++) {
			Cuota elmCuota = new Cuota(i+1);
			elmCuota.setCuota(valorCuota);
			prestamo.getCuotas().add(elmCuota);
			if(i==0) {
				elmCuota.setInicio(prestamo.getMonto());
			}
		}
		
		for(int i = 0;i<plazo;i++) {
			Cuota cuotaActual = cuotas.get(i);
			Cuota cuotaSiguiente = null;
			if(i<plazo-1) {
				cuotaSiguiente = cuotas.get(i+1);
			}
			calcularValoresCuota(interesAnual, cuotaActual, cuotaSiguiente);
		}
	}
	
	
	
	public static void calcularValoresCuota(double interes, Cuota cuota, Cuota cuotaSiguiente) {
		double valorInteres = (interes/12)*cuota.getInicio()/100;
		double abonoCapital;
		double saldoActual = 0;
		cuota.setInteres(valorInteres);
		
		if(cuotaSiguiente != null) {
			abonoCapital = cuota.getCuota()-valorInteres;
			saldoActual = cuota.getInicio() - abonoCapital;
			cuotaSiguiente.setInicio(saldoActual);
		}else {
			abonoCapital = cuota.getInicio();
			double cuotaAjustada = abonoCapital + valorInteres;
			saldoActual = 0.0;
			cuota.setCuota(cuotaAjustada);
		}
		
		
		cuota.setAbonoCapital(abonoCapital);
		cuota.setSaldo(saldoActual);
	}
	
	
	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("No.  | Cuota  | Inicio | Interés | Abono  | Saldo");
        System.out.println("-----|--------|--------|---------|--------|-------");
		for(Cuota cuota:prestamo.getCuotas()) {
			cuota.mostrarPrestamo();
		}
	}
	
}
