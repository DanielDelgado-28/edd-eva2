
package eva2_2_listasimple;

/**
 *
 * @author Daniel Adrian Delgado Gonzalez
 */
public class EVA2_2_ListaSimple {


    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("Tamano de la lista "+ lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.valorEn(2);
        lista.imprimir();
        lista.imprimirInverso();
        lista.longitud();
        lista.insertarEn(3, 999);
        lista.imprimir();
        lista.borrarEn(3);
        lista.imprimir();
        lista.encontrar(300);
        
        System.out.println("Tamano de la lista "+ lista.longitud());
        lista.vaciarLista();
        lista.imprimir();
        System.out.println("Tamano de la lista "+ lista.longitud());
        
        
        
        
        
        /* TOMAR EL TIEMPO DE EJECUCION
        int[] arreglo = new int[1000000];
        long ini, fin, tiempo;
        ini = System.nanoTime();// tomamos la hora antes de empezar
        //ARREGLO
        for (int i = 0; i < 10; i++) {
            arreglo[i]= (int)(Math.random() * 100);
            
        }
        fin = System.nanoTime();//tomar la hora despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo de arreglo ="+ tiempo);
        
        
        //LISTA
        ini = System.nanoTime();// tomamos la hora antes de empezar
        for (int i = 0; i < 1000000; i++) {
            lista.agregar( (int)(Math.random() * 100));
            
        }
        fin = System.nanoTime();//tomar la hora despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo de lista ="+ tiempo);
        */
        
    }
    
}
