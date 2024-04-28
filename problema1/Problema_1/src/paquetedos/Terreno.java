/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void calcularCosto_terreno(){
        costo_terreno = valorMetroCuadrado * area;
    }
    
    public void establecerAncho(double anc){
        ancho = anc;
    }
    
    public void establecerLargo(double larg){
        largo = larg;
    }

    public void calcularArea(){
        area = largo * ancho;
    }

    public void establecerValorMetroCuadrado(double valor){
        valorMetroCuadrado = valor;
    }
    
    public double obtenerCosto_terreno(){
        return costo_terreno;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
}
