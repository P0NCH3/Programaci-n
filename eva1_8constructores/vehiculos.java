package eva1_8constructores;
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
    class vehiculos{
    //atributos - Privados
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    //construciones-metodos
    //METODOS: NO TIENEN VALOR RETORNO
    //MODIFICADOR DE ACCESO NOMBRE DE LA CLASE(LISTA DE PARÁMETROS)
    //CONSTRUCTOR DEFAULT: CONSTRUCTOR SIN PARÁMETROS
public vehiculos(){
 
            //inicializar atributos
            marca = "SIN MARCA";
            modelo = "SIN MODELO";
            precio = 0;
            year = 0;
            color = "Sin color";

        }
        //imprimir datos
        public void imprimirDatos() { 
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Precio: " + precio);
            System.out.println("Año: " + year);
            System.out.println("Color: " + color);
         }
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
    }//

    }