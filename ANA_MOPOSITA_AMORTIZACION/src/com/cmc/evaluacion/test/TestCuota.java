package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.entidades.Prestamo;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo prestamo = new Prestamo(5000, 12, 12);
        double cuota = CalculadoraAmortizacion.calcularCuota(prestamo);
        System.out.println("Cuota: " + cuota);
     
        
    }
    
    
}
