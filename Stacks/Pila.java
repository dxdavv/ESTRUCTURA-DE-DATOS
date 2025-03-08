package Stacks;

public class Pila {

    private Nodo top;

    public Pila() {
        top = null;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (this.top == null) {
            this.top = nuevo;
        } else {
            nuevo.setSiguiente(this.top);
            this.top = nuevo;
        }
    }

    // if (this.top != null){
    // }

    public void imprimePila (){
        Nodo aux;
        aux = this.top;
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public void pop (){
        if(top != null){
        top = top.getSiguiente();
        }
    }

    public int getValorTop(){
        return top.getDato();
    }
}
