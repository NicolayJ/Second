/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;
public class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;
    
    public void establecerHoras(int hor){
        horas = hor;
    }
    
    public void calcularMinutos(){
        minutos = horas * 60;
    }
    
    public void calcularSegundos(){
        segundos = horas * 3600;
    }
    
    public void calcularDias(){
        dias = (double)horas / 24;
    }
    
    public int obtenerHoras(){
        return horas;
    }
    
    public int obtenerMinutos(){
        return minutos;
    }
    
    public int obtenerSegundos(){
        return segundos;
    }
    
    public double obtenerDias(){
        return dias;
    }
}
