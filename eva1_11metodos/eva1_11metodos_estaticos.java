package eva1_11metodos;

public class eva1_11metodos_estaticos{

    public static void main(String[] args){

        double valorRndom = Math.random();
        int valor = (int)(valorRndom *1000);
        System.out.println(valorRndom);
        System.out.println(valor);
        //
        //Math math = new Math();
        Persona pers = new Persona();
        pers.mostrarMensaje();
        //
        //Temperaturas tempe = new Temperaturas();
        //System.out.println(tempe.convertifFaC(100));
        System.out.println(Temperaturas.ConvertifFaC(100));
        System.out.println(Temperaturas.ConvertirCaF(100));
        System.out.println(Temperaturas.ConvertirCaK(100));
        System.out.println(Temperaturas.ConvertirKaC(100));
        System.out.println(Temperaturas.ConvertirFaK(100));
        System.out.println(Temperaturas.ConvertirKaF(100));

    }
    
}

 class Persona {

    int valor;
    public void mostrarMensaje(){
        System.out.println("Hola mundo" + valor);
    }
}