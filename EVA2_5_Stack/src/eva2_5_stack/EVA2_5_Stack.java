
package eva2_5_stack;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA2_5_Stack {


    public static void main(String[] args) {
        stack torre = new stack();
        torre.agregar(100);
        torre.agregar(200);
        torre.agregar(300);
        torre.agregar(400);
        torre.agregar(500);
        torre.push(600);
        torre.imprimir();
        torre.peek();
        torre.pop();
        torre.imprimir();
    }
    
}
