/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteUno;

import paqueteDos.EquivalenteHora;

public class Ejecutor {
    public static void main(String[] args) {
        
        EquivalenteHora equiT = new EquivalenteHora();
 
        int horas = 28;
        
        equiT.establecerHoras(horas);
        
        equiT.calcularMinutos();
        equiT.calcularSegundos();
        equiT.calcularDias();
        
        System.out.printf("Hora: %d\n-------------------\nSU EQUIVALENCIA EN:\n"
                + "-------------------\n-> minutos: %d\n-> segundos: %d\n"
                + "-> dias: %.2f\n",equiT.obtenerHoras(), equiT.obtenerMinutos(),
                equiT.obtenerSegundos(), equiT.obtenerDias());
       
    }
}
