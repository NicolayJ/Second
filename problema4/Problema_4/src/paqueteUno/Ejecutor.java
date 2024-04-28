/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteUno;

import paqueteDos.EquipoCelulares;

public class Ejecutor {
    public static void main(String[] args) {
        
        EquipoCelulares equiCell = new EquipoCelulares();
        
        String sistema = "iOS";
        String tamanio = "5.5 pulgadas";
        double costo = 800;
        double iva = 15;
        String mac = "11:22:33:44:55:66";
        String imei = "98765432098765";
        
        equiCell.establecerSistemaOperativo(sistema);
        equiCell.establecerTamanioPantalla(tamanio);
        equiCell.establecerCostoInicial(costo);
        equiCell.establecerIvaPorcentaje(iva);
        equiCell.establecerDireccionMac(mac);
        equiCell.establecerInformacionImei(imei);
        
        equiCell.establecerIvaCostoInicial();
        equiCell.establecerCostoFinal();
        
        System.out.printf("INFORMACION DEL CELULAR:\nSistema Operativo: %s\n"
                + "Tamaño de Pantalla: %s\nDireccion MAC: %s\nInformacion IMEI: %s\n"
                + "Costo inicial: $ %.2f\nPorcentaje de IVA: %.2f%% \n"
                + "Valor agregado: $ %.2f\nCosto Final: $ %.2f\n",
                equiCell.obtenerSistemaOperativo(),
                equiCell.obtenerTamanioPantalla(),
                equiCell.obtenerDireccionMac(),
                equiCell.obtenerInformacionImei(),
                equiCell.obtenerCostoInicial(),
                equiCell.obtenerIvaPorcentaje(),
                equiCell.obtenerIvaCostoInicial(),
                equiCell.obtenerCostoFinal());

        
    }
}
