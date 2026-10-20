
package eva2_4_queue;

/**
 *
 * @author Danil Adrian Delgado Gonzalez
 */
public class EVA2_4_Queue {


    public static void main(String[] args) {
        MyQueue fila = new MyQueue();
        fila.agregar(100);
        fila.agregar(200);
        fila.agregar(300);
        fila.agregar(400);
        fila.agregar(500);
        fila.imprimir();
        fila.push(600);
        fila.peek();
        fila.pop();
        fila.imprimir();
    }
    
}
