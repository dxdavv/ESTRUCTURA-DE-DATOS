package List;

public class Main {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        lista.imprimir();
        System.out.println();
        

        Nodo x = new Nodo(8);
        lista.insertarDato(x, 2);
        System.out.println();
        lista.imprimir();
    }
}
