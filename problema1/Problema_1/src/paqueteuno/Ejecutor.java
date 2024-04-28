/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;
import paquetedos.Terreno;
public class Ejecutor {
    public static void main(String[] args) {
        
        Terreno costoTr = new Terreno();
        
        double ancho = 12.4;
        double largo = 16.9;
        double valorMetroCuadrado = 151;
        
        costoTr.establecerAncho(ancho);
        costoTr.establecerLargo(largo);
        costoTr.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        costoTr.calcularArea();
        costoTr.calcularCosto_terreno();
        
        System.out.printf("COSTO DE UN TERRENO RECTANGULAR \n"
                + "===================================== \n"
                + "Ancho del Terreno: %.2f metros\nLargo del Terreno: %.2f metros\n"
                + "Area del Terreno: %.2f metros cuadrados\n-------------------------------- \n"
                + "Valor del metro cuadrado: $ %.2f \nCosto final del terreno: $ %.2f\n",
                costoTr.obtenerAncho(), costoTr.obtenerLargo(),
                costoTr.obtenerArea(),costoTr.obtenerValorMetroCuadrado(),
                costoTr.obtenerCosto_terreno());
    }
}
