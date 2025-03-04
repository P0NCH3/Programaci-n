package eva2_practica1;

class TestCovid{

private int edad;
private boolean tieneEnfermedad;
private int peso;
private int estatura;
public TestCovid(){
    this.edad = 43;
    this.tieneEnfermedad = false;
    this.peso = 80;
    this.estatura = 180;
}
public TestCovid(int edad, boolean tieneEnfermedad, int peso, int estatura){
this.edad= edad;
this.tieneEnfermedad=tieneEnfermedad;
this.peso=peso;
this.estatura = estatura;
}
public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad = edad;
}
public boolean getTieneEnfermedad(){
    return tieneEnfermedad;
}
public void setTieneEnfermedad(boolean tieneEnfermedad){
    this.tieneEnfermedad = tieneEnfermedad;
}
public int getPeso(){
    return peso;
}
public void setPeso(int peso){
    this.peso = peso;
}
public int getEstatura(){
    return estatura;
}
public void setEstatura(int estatura){
    this.estatura = estatura;
}


private double calcularMC() {
    double mts = estatura / 100.0;
    return (peso/(mts * mts));
}

public String calcularRiesgo(){
    if (edad >= 65){
    System.out.println( "persona sin riesgo");
    
    } else if (tieneEnfermedad == true){
        System.out.println( "persona sin riesgo");
    }else if (calcularMC() > 30){
    System.out.println( "persona sin riesgo");
    } else {
    System.out.println( "persona sin riesgo");
    }
    return null;
}

}
