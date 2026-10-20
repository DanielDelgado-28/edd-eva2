
package eva2_5_stack;

/**
 *
 * @author LENOVO
 */
public class Nodo {
    //Dos Atributos 
    private int valor ;
    private Nodo siguiente;
    private Nodo previo;
    //CONSTRUCTORES

    public Nodo() {
        this.siguiente = null;//Esto es muy importante, marca el final de la lista 
        this.previo = null;
    }

    public Nodo(int valor) {//poner el valor a guardar, al momento de crear el nodo
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
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

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
    
    
}
