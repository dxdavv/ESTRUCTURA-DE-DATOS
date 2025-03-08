public class Bubblesort {

    private Moneda[] a;

    public Bubblesort(Moneda[] a) {
        this.a = a;
    }

    public void ordenar() {
        Moneda aux;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1].getDenominacion() > a[j].getDenominacion()) {
                    aux = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }
}
