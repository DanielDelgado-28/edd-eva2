
package eva2_9_factorial;

public class EVA2_9_Factorial {

    public static void main(String[] args) {
        System.out.println("factorial de 5 - "+ factorialCiclo(5));
        System.out.println("factorial de 5 - "+ factorialRecu(5));
    }
    
    public static int factorialCiclo(int valor){
        int resu = 1;
        for (int i = 0; i <= valor; i++) {
            resu *= i;
        }
        return resu;
    }
    public static int factorialRecu(int valor){
        if(valor == 0)
            return 1;
        else
            return(valor * factorialRecu(valor-1));

        
    }
}
