package Qeues;

public class Fila {
    public static void main(String[] args) {
        
    Cola fila = new Cola();

    fila.encolar(4);
    fila.encolar(6);    
    fila.encolar(7);
    fila.encolar(1);
    fila.encolar(73);
    fila.encolar(85);
    fila.encolar(564);
    fila.encolar(125);

    fila.imprimir();

    fila.desencolar();
    fila.desencolar();
    fila.desencolar();
    fila.desencolar();
    fila.desencolar();

    System.out.println();
    fila.imprimir();

    }
}
