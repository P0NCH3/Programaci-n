package eva1_10nuevotema;

public class laptop {
    private String procesador;
    private String memoria;
    private String discoduro;
    private String marca;
    private String modelo;
    private String pantalla;
    
     public String getProcesador(){
        return this.procesador;
    }
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    public String getMemoria(){
        return this.memoria;
    }
    public void setMemoria(String memoria){
        this.memoria = memoria;
    }
        public String getDiscoduro(){
        return this.discoduro;
    }
    public void setDiscoduro(String discoduro){
        this.discoduro = discoduro;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getPantalla(){
        return this.pantalla;
    }

 public void setPantalla(String pantalla){
      this.pantalla = pantalla;
}
     public laptop(){
     this.procesador = "SIN NOMBRE";
       this.memoria = "SIN NOMBRE";
       this.discoduro = "SIN NOMBRE";
       this.marca = "SIN NOMBRE";
       this.modelo = "SIN NOMBRE";
       this.pantalla = "SIN NOMBRE";
     
 }
    public laptop(String procesador, String memoria, String discoduro, String marca, String modelo, String pantalla){
       this.procesador = procesador;
      this.memoria = memoria;
      this.discoduro = discoduro; 
      this.marca = marca;
      this.modelo = modelo;
      this.pantalla = pantalla;
    }
     public void setImprimirdatos(){
         System.out.println("Procesador: " + procesador);
         System.out.println("Memoria: " + memoria);
         System.out.println("Discoduro:" + discoduro);
         System.out.println("Marca: " + marca);
         System.out.println("Modelo:" + modelo);
         System.out.println("Pantalla:" + pantalla);
         
     }
}
