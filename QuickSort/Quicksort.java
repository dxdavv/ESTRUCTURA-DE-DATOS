public class Quicksort {

    private Tenis [] A;

    public Quicksort(Tenis [] A) {
        this.A = A;
    }

    public void quicksort(int ini, int fini) {
        if (ini < fini) {
            int pvt = divide(ini, fini);
            quicksort(ini, pvt - 1);
            quicksort(pvt + 1, fini);
        }
    }

    public int divide(int ini, int fini) {
        Tenis pvt = A[ini];
        int izq = ini;
        int der = fini;

        while (izq < der) {
            while (A[der].getTalla() > pvt.getTalla()) {
                der--;
            }

            while (izq < der && A[izq].getTalla() <= pvt.getTalla()) {
                izq++;
            }

            if (izq < der) {
                Tenis tmp = A[izq];
                A[izq] = A[der];
                A[der] = tmp;

            }
        }

        Tenis tmp = A[der];
        A[der] = A[ini];
        A[ini] = tmp;
        return der;
    }

}
