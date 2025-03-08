package List;

public class ListaSimple {

    private Nodo ini;
    private Nodo fin;

    public ListaSimple() {
        this.ini = null;
        this.fin = null;
    }

    public void agregar(int dato) {
        Nodo n = new Nodo(dato);
        if (ini == null && fin == null) {
            ini = n;
            fin = n;
        } else {
            fin.setSiguiente(n);
            fin = n;
        }
    }

    public void imprimir() {
        Nodo aux = ini;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public void eliminarEn(int posicion) {
        // Nodo aux = ini;
        if (posicion == 0) {
            ini = ini.getSiguiente();
            return; // aux = null; si la posicion es 0 entonces ya no hace lo que esta abajo y ya no
                    // es necesario hacer lo del else
            // el return termina la funcion ahi
        } // else {
        Nodo aux = ini;
        for (int i = 0; i < posicion - 1; i++) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        // }
    }

    public void eliminarA(int dato) {
        Nodo auxiliar = ini;

        if (auxiliar.getDato() == dato) {
            ini = ini.getSiguiente();
            return;
        }
        while (auxiliar != null) {
            if (auxiliar.getSiguiente().getDato() == dato) {
                if (auxiliar.getSiguiente().getSiguiente() == null) {
                    fin = auxiliar;
                }
                auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                return;
            }
            auxiliar = auxiliar.getSiguiente();
        }
    }

    public void insertarDato(Nodo nuevo, int posicion) {
        Nodo aux = ini;
        if (posicion == 0) {
            nuevo.setSiguiente(ini);
            ini = nuevo;
        } else {
            try {
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo); 
            } catch (NullPointerException e) {
                System.out.println("La posicion no existe");
            }
       
        }
    }
}
