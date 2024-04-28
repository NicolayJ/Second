/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteUno;
import paqueteDos.AdministrarInstitucionesEducativas;

public class Ejecutor {
    public static void main(String[] args) {
        
        AdministrarInstitucionesEducativas admInsEdu = new AdministrarInstitucionesEducativas();
        
        String nombre = "Colegio de Bachillerato Particular Antonio Peña Celi";
        String tipoInstitucion = "Particular";
        int alumnos = 1305;
        int docentes = 50;
        int sedes = 2 ;
        double gastosProyecEst = 189.18;
        
        admInsEdu.establecerNombre(nombre);
        admInsEdu.establecerTipoInstitucion(tipoInstitucion);
        admInsEdu.establecerNumeroAlumnos(alumnos);
        admInsEdu.establecerNumeroDocentes(docentes);
        admInsEdu.establecerNumeroSedes(sedes);
        admInsEdu.establecerGastosProyectadoEstudiante(gastosProyecEst);
        
        admInsEdu.calcularPresupuesto();
        
        System.out.printf("ADMINISTRACION DE INSTITUCIONES PUBLICAS\n"
                + "----------------------------------------\nNombre: %s\n"
                + "Tipo de institucion: %s\nNumero de alumnos: %d\nNumero de docentes: %d\n"
                + "Numero de sedes %s\nGastos proyectado por estudiante: %.2f\n"
                + "Presupuesto: %.2f\n",admInsEdu.obtenerNombre(),
                admInsEdu.obtenerTipoInstitucion(), admInsEdu.obtenerNumeroAlumnos(),
                admInsEdu.obtenerNumeroDocentes(),admInsEdu.obtenerNumeroSedes(),
                admInsEdu.obtenerGastosProyectadosPorEstudiante(),
                admInsEdu.obtenerPresupuesto());
        
    }
}
