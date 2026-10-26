
package eva2_10_mcd;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA2_10_mcd {

    public static void main(String[] args) {
        System.out.println("El MCD es ="+MaximoDiv(11, 180));
        
    }
    
    public static int MaximoDiv(int dividendo, int divisor){
        if(divisor == 0){
            return dividendo;
        }
         return MaximoDiv(divisor, dividendo%divisor);
    }
    
}

//fibo (4) = fibo (2) + fibo(3)