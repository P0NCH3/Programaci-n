package pract;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /**
 *
 * @author Maximiliano
 */

    /**
     * @param args the command line arguments
     */

public class eva_1_practica_4 {
    //*@param args the command line arguments
    public static  void main(String[] args){
        //Persona Vehiculo;
        //todo code application logic here
        Vehiculo carro = new Vehiculo();
        carro.setMarca("Chevrolet");
        carro.setModelo("4x4");
        carro.setColor("Negro");
        carro.setYear(2005);
        carro.setPrecio(2000000);
        System.out.println("Marca:" + carro.getMarca());
        System.out.println("Modelo:" + carro.getModelo());
        System.out.println("Color:" + carro.getColor());
        System.out.println("Año:" + carro.getYear());
        System.out.println("Precio:" + carro.getPrecio());

    }

    public static void mai(String[] args){
        Scanner scan = new Scanner (System.in);
        Vehiculo carro = new Vehiculo();
        System.out.println("Marca del vehiculo:");    
        String cade = scan.nextLine();
        carro.setMarca(cade);
        carro.setModelo("4x4");
        carro.setColor("Negro");
        carro.setYear(2005);
        carro.setPrecio(2000000);
    }
}
