
package eva2_8_recursividad;


public class EVA2_8_Recursividad {


    public static void main(String[] args) {
        imprimirCiclo(5);
        imprimirRecu(5);
    }
    
    public static void imprimirCiclo(int numero){
        for (int i = 0; i < -1; i++) {
            System.out.println(i+"");
        }
        System.out.println("");
    }
    
    public static void imprimirRecu(int numero){
        //resuelva una parte de el problema
        System.out.print(numero + "-");
        //se llame a su mismo
        if(numero > 1){//detener recursividad 
        imprimirRecu(numero -1);
        }
    }
}
