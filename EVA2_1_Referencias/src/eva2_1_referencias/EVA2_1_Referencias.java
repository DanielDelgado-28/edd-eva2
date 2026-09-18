
package eva2_1_referencias;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA2_1_Referencias {


    public static void main(String[] args) {
        Ejemplo inicio = new Ejemplo();
        inicio.valor = 100;
        System.out.println("inicio = "+inicio);
        System.out.println("Inicio.valor = "+inicio.valor);
        System.out.println("Inicio.otro = "+ inicio.otro);
        //crear una lista 
        inicio.otro = new Ejemplo();
        inicio.otro.valor = 200;//segundo objeto
        inicio.otro.otro = new Ejemplo();//tercer valor
        inicio.otro.otro.valor = 300;//valor de el tecer objeto
        inicio.otro.otro.otro = new Ejemplo();//cuarto objeto
        inicio.otro.otro.otro.valor = 400;//valor del cuarto
        
        //como nos movemos por todos los objetos
        Ejemplo sig = inicio;
        while(sig != null){
            System.out.println("[ "+sig.valor+ " ]");
            sig = sig.otro;
        }
        }

    }
    class Ejemplo{
        int valor;
        Ejemplo otro;
    
}
