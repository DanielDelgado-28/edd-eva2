
package eva2_2_listasimple;

/**
 *
 * @author LENOVO
 */
public class Nodo {
    //Dos Atributos 
    private int valor ;
    private Nodo siguiente;
    //CONSTRUCTORES

    public Nodo() {
        this.siguiente = null;//Esto es muy importante, marca el final de la lista 
    }

    public Nodo(int valor) {//poner el valor a guardar, al momento de crear el nodo
        this.valor = valor;
        this.siguiente = null;
    }

    public int getvalor() {
        return valor;
    }

    public void setvalor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
