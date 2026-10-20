package eva2_3_listadoble;

//imprimir, vaciar, lista vacia, longitud

public class Listadoble {
    private Nodo inicio;
    private Nodo fin;
    private int lon;

    public Listadoble() {
        inicio = null;
        fin = null;
        lon = 0;
    }

    //O(N)
    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.println("[ " + temp.getvalor() + " ]");
            temp = temp.getSiguiente();
        }
    }

    //O(N)
    public void imprimirInverso() {
        Nodo temp = fin;
        while (temp != null) {
            System.out.println("[ " + temp.getvalor() + " ]");
            temp = temp.getPrevio();
        }
    }

    //O(1)
    public int longitud() {
        System.out.println("La lista tiene " + lon + " elementos");
        return lon;
    }

    //O(1)
    public boolean listaVacia() {
        if (inicio == null) {
            System.out.println("La lista esta vacia");
            return true;
        }
        return false;
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        lon = 0;
    }

    //O(1)
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        lon++;
    }

    //O(N) --> hay que recorrer hasta la posicion
    public void insertarEn(int posicion, int valor) throws RuntimeException {
        if (posicion < 0 || posicion > lon) {
            throw new RuntimeException("la posicion es invalida: " + posicion);
        }
        if (posicion == lon) {          // incluye lista vacia y final
            agregar(valor);             // agregar ya hace lon++
            return;
        }

        Nodo nuevo = new Nodo(valor);

        if (posicion == 0) {            // aqui la lista no esta vacia
            nuevo.setSiguiente(inicio);
            inicio.setPrevio(nuevo);
            inicio = nuevo;
        } else {                        // en medio
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {   // temp = nodo que esta en la posicion
                temp = temp.getSiguiente();
            }
            nuevo.setSiguiente(temp);
            nuevo.setPrevio(temp.getPrevio());
            temp.getPrevio().setSiguiente(nuevo);
            temp.setPrevio(nuevo);
        }
        lon++;
    }

    //O(N) --> hay que recorrer hasta la posicion
    public int borrarEn(int posicion) throws RuntimeException {
        //para borrar, las posiciones validas son de 0 a N-1
        if (posicion < 0 || posicion >= lon) {
            throw new RuntimeException("la posicion es invalida: " + posicion);
        }

        int valorBorrado;

        if (posicion == 0) {            // borrar el primero
            valorBorrado = inicio.getvalor();
            inicio = inicio.getSiguiente();
            if (inicio == null) {       // quedo vacia
                fin = null;
            } else {
                inicio.setPrevio(null);
            }
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {   // temp = nodo a borrar
                temp = temp.getSiguiente();
            }
            valorBorrado = temp.getvalor();
            temp.getPrevio().setSiguiente(temp.getSiguiente());
            if (temp == fin) {          // borramos el ultimo
                fin = temp.getPrevio();
            } else {
                temp.getSiguiente().setPrevio(temp.getPrevio());
            }
        }
        lon--;
        return valorBorrado;
    }
}
    
    
    /*nuevo.siguiente = inicio;
    inicio.previo = nuevo;
    inicio = nuevo;
    
    //en medio
    nuevo.siguiente = temp;
    nuevo.previo = temp.previo;
    temp.previo.siguiente = nuevo;
    temp.previo = nuevo; */

    
    
    
    
    
    

