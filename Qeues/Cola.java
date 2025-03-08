package Qeues;

public class Cola {
    
    private Nodo inicio;
    private Nodo fini;

    public Cola (){
        inicio = null;
        fini = null;
    }

    public void encolar(int dato){
        Nodo nuevo = new Nodo(dato);

        if( inicio == null){
            inicio = nuevo;
            fini = nuevo;
        }else{
            fini.setSiguiente(nuevo);
            fini = nuevo;
        } 
    }

    public void imprimir(){
        Nodo aux  = inicio;
        while (aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public void desencolar(){
        if (inicio != fini){
            inicio = inicio.getSiguiente();
        } else {
            inicio = null;
            fini = null;
        }
    }

    public void eliminar(){
        while(inicio != null){
            this.desencolar();
        }
    }

}