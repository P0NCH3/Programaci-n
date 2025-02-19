package eva1_13sobrecargametodos;



public class SobrecargaMetodos {
public static void main(String[] args) {
    
System.out.println("Hola mundo");
System.out.println(100);
System.out.println(100.10);
System.out.println(3 > 5);
System.out.println('c');
System.out.println(new SobrecargaMetodos());
System.out.println(sumar(5,3));


}

    public static int sumar(int val1, int val2){
return val1 + val2;
    }
    public static String sumar(String val1, String val2){
        return val1 + val2;
    }
    public static void sumar(){
        System.out.println("Metodo que no hace nada");
    }
}
