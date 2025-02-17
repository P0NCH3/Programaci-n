package eva1_10nuevotema;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
       this.nombre = "SIN NOMBRE";
       this.apellido = "SIN NOMBRE";
       this.edad = 0;
    }
    public Persona(String nombre, String apellido, int edad){
       this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
     public void setImprimirdatos(){
         System.out.println("Nombre: " + nombre);
         System.out.println("Apellido: " + apellido);
         System.out.println("Edad:" + edad);
         }
    
}
