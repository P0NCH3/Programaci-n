package eva1_12calculadora;

class Calculadora {
    public static void main(String[]args){
       
       System.out.println("la Suma es:" + Sumar(8, 9));
       System.out.println("la Resta es:" + Restar(8, 9));
       System.out.println("la Multiplicación es: " + Multiplicar(8, 9));
       System.out.println("la División es: " + Dividir(8, 9));
       System.out.println("la Potencia es: " + Potencia(8, 9));
        
        }
 
    public static int Sumar(int sum1, int sum2){
        return sum1 + sum2;
    }
    public static int Restar(int rest1, int rest2){
    
        return rest1 - rest2;
    }
    public static int Multiplicar(int multi1, int multi2){
    
        return multi1 * multi2;
    }
    public static double  Dividir(double div1, double div2){
    
        return div1 / div2;
    }
    public static double  Potencia(double potencia1, double  potencia2){
        double potenciacion;
       potenciacion = Math.pow(potencia1, potencia2) ;
        return potenciacion ;
    
    
    }
    
    
 }
 
