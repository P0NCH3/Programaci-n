public class EVA1_1_CLASES_OBJETOS {
    /**
     * @param args
     */
    public static void main (String[] args)  {
    //CREAR UN OBJETO
    //INSTANCIAR
    //Identificador para guardar la dirección en memoria
    //variable de un tipo de dato abstracto
    Persona persol;//declaramos una variable de tipo per
    //asignamos memoria
    persol = new Persona (); //creamos un objeto de tipo r
    persol.edad = 10;
    persol.genero = "H";
    persol.nombre = "Juan Perez";
    persol.imprimirDatos();
        }
    }
    class Persona {
    //DATOS - ESTADO - ATRIBUTOS
        String nombre;
        int edad;
        String genero;
        //COMPORTAMIENTO
        void imprimirDatos() {
        System.out.println ("Nombre: " + nombre);
        System.out.println ("Edad: " + edad);
        System.out.println ("Genero: " + genero);
     }

}