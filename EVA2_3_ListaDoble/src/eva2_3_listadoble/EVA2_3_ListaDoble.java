
package eva2_3_listadoble;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA2_3_ListaDoble {


    public static void main(String[] args) {
        Listadoble lista = new Listadoble();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.borrarEn(4);
        lista.imprimir();
        System.out.println("");
        lista.imprimirInverso();
    }
    
}
