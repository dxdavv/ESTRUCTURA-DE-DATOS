package Algoritmos;

public class Bubblesort {

    private Persona[] a;

    public Bubblesort(Persona[] a) {
        this.a = a;
    }

    public void ordenar() {
        Persona aux;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1].getEdad() > a[j].getEdad()) {
                    aux = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }
}
