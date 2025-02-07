package venta;
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
class Television {
    private boolean encendido;
    private int volumen;
    private int canal;

    public void imprimirDatos() {
        System.out.println("Televisión encendida: " + encendido);
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
    }
    //modo de encendido de la tele
    public void encenderApagar() {
        if(encendido == !encendido);  // Cambiar el estado de encendida
        System.out.println("Televisión encendida.");

        }
    
//Subir el volumen
    public void subirVolumen() {
        if (encendido == volumen < 100) {
            volumen+=1;
            System.out.println("Volumen aumentado a: " + volumen);
        } else {
            System.out.println("No se puede subir el volumen.");
        }
    }

//Bajar el volumen
    public void bajarVolumen() {
        if (encendido == volumen > 0) {
            volumen-=1;
            System.out.println("Volumen reducido a: " + volumen);
        } else {
            System.out.println("No se puede bajar el volumen.");
        }
    }

//Cambiar canales
    public void cambiarCanal() {
        if (encendido == !encendido) {
            canal = (canal = 100) + 1; // Canal entre 1 y 100
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("La tele esta apagada, prendela para cambiar el canal");
        }
}

}