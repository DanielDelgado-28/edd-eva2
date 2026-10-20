package eva2_5_stack;

public class stack {
    private Nodo inicio;
    private Nodo fin;
    private int lon;

    public stack() {
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

    //O(N)
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

    //O(N)
    public int borrarEn(int posicion) throws RuntimeException {
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

    //O(N)
    public int valorEn(int posicion) throws RuntimeException {
        if (posicion >= 0 && posicion < lon) {
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getvalor();
        } else {
            throw new RuntimeException("la posicion es invalida: " + posicion);
        }
    }

    //stack --> LIFO
    //O(1)
    public void push(int valor) {
        agregar(valor);
    }

    //O(1) lee el de arriba sin borrarlo
    public int peek() {
        if (fin == null) {
            throw new RuntimeException("el stack esta vacio");
        }
        return fin.getvalor();
    }

    public int pop() {
        if (fin == null) {
            throw new RuntimeException("el stack esta vacio");
        }
        int valor = fin.getvalor();
        fin = fin.getPrevio();
        if (fin == null) { // quedo vacio
            inicio = null;
        } else {
            fin.setSiguiente(null);
        }
        lon--;
        return valor;
    }
}