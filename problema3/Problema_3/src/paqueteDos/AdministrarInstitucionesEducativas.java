/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;
public class AdministrarInstitucionesEducativas {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadoEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String nombr){
        nombre = nombr;
    }
    
    public void establecerTipoInstitucion(String tipo){
        tipoInstitucion = tipo;
    }
    
    public void establecerNumeroAlumnos(int numAlum){
        numeroAlumnos = numAlum;
    }
    
    public void establecerNumeroDocentes(int numDocen){
        numeroDocentes = numDocen;
    }
    
    public void establecerNumeroSedes(int numSedes){
        numeroSedes = numSedes;
    }
    
    public void establecerGastosProyectadoEstudiante(double gasXest){
        gastosProyectadoEstudiante = gasXest;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numeroAlumnos * gastosProyectadoEstudiante;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }    
    
    public double obtenerGastosProyectadosPorEstudiante() {
        return gastosProyectadoEstudiante;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
