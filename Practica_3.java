package clases;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /**
 *
 * @author ririo
 */
public class Practica_3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //INSTAnCIAR UN OBJETO
        Persona Datos;
        //CLASE IDENTIFICADOR = new CONSTRUCTOR (PARAMETROS);
        Datos = new Persona();
        Datos.setNombre("Maximiliano");
        Datos.setApellidos("Buitimea");
        Datos.setEdad(25);
        Datos.setGenero("Bicicleta");
        Datos.setCurp("Si");
        System.out.println("Nombre: " + Datos.getNombre());
        System.out.println("Apellidos: " + Datos.getApellidos());
        System.out.println("Edad: " + Datos.getEdad());
        System.out.println("Genero: " + Datos.getGenero());
        System.out.println("CURP: " + Datos.getCurp());
    }
    
}