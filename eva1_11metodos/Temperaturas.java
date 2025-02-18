package eva1_11metodos;
public class Temperaturas {
    private Temperaturas(){

    }
    public static double ConvertifFaC(double fa){
        double resul;
        resul = (fa - 32) * (5.0/9.0);
        return resul;
    }
    public static double ConvertirCaF(double ce){
        double resul;
        resul = ce * (9.0 / 5.0) + 32;
        return resul;
    }
    public static double ConvertirCaK(double ce){
        double result;
        result = ce + 273.15;
        return result;
    }
    public static double ConvertirKaC(double ke){
        double result;
        result = ke - 273.15;
        return result;
    }
    public static double ConvertirFaK(double fa){
        double result;
        result = (5.0/9.0)*(fa - 32) + 273.15;
        return result;
    }
    public static double ConvertirKaF(double ke){
        double resulta;
        resulta = (1.8)* (ke - 273.15) + 32;
        return resulta;
    } 
}


