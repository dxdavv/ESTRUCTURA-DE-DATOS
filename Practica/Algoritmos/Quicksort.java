package Algoritmos;

public class Quicksort {

    private Persona [] A;

    public Quicksort(Persona [] A) {
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
        Persona pvt = A[ini];
        int izq = ini;
        int der = fini;

        while (izq < der) {
            while (A[der].getAltura() > pvt.getAltura()) {
                der--;
            }

            while (izq < der && A[izq].getAltura() <= pvt.getAltura()) {
                izq++;
            }

            if (izq < der) {
                Persona tmp = A[izq];
                A[izq] = A[der];
                A[der] = tmp;

            }
        }

        Persona tmp = A[der];
        A[der] = A[ini];
        A[ini] = tmp;
        return der;
    }
}
