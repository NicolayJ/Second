/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;
public class EquipoCelulares {
    private String sistemaOperativo;
    private String tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;
    
    public void establecerSistemaOperativo(String sistOpe){
        sistemaOperativo = sistOpe;
    }
    
    public void establecerTamanioPantalla(String tamaPant){
        tamanioPantalla = tamaPant;
    }
    
    public void establecerCostoInicial(double costIni){
        costoInicial = costIni;
    }
    
    public void establecerIvaPorcentaje(double ivaPorc){
        ivaPorcentaje = ivaPorc;
    }
    
    public void establecerIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (ivaPorcentaje / 100.0);
    }

    
    public void establecerCostoFinal(){
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public void establecerDireccionMac(String mac){
        direccionMac = mac;
    }
    
    public void establecerInformacionImei(String imei){
        informacionImei = imei;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public String obtenerTamanioPantalla(){
        return  tamanioPantalla;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public double obtenerIvaPorcentaje(){
        return  ivaPorcentaje;
    }
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    
    public String obtenerInformacionImei(){
        return informacionImei;
    }
}
