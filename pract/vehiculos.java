package pract;
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

 class Vehiculo {
    //atributos - Privados
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    //construciones-metodos
    //metodos-comportamiento
    //get-set

    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor)
    {
        marca = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor)
    {
        modelo = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor)
    {
        precio = valor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int valor)
    {
        year = valor;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String valor)
    {
        color = valor;
    }
}
