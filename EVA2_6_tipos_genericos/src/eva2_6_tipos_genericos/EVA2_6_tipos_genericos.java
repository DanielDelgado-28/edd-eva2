
package eva2_6_tipos_genericos;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA2_6_tipos_genericos {


    public static void main(String[] args) {
        //int --> Integer
        //double --> Double
        Ejemplo<ListaDoble> prueba = new Ejemplo<ListaDoble>();
        //prueba.
    }
    
}
class ListaDoble{}

class Ejemplo<T> {// aquie le estamos diciendo es que vamos a usar cualquier tipo de dato
    private T dato;

    public Ejemplo() {
    }
 
    public Ejemplo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    
}