import java.util.Vector;

public class mergesort {

    private Musica[] A;

    public mergesort(Musica[] A) {
        this.A = A;
    }

    public void merge(int menor, int mayor) {
        int mitad;
        if (menor < mayor) {
            mitad = (menor + mayor) / 2;
            merge(menor, mitad);
            merge(mitad + 1, mayor);
            mergeS(menor, mitad, mayor);
        }
    }

    public void mergeS(int men, int mitad, int mayor) {
        Vector<Musica> B = new Vector<Musica>();
        Vector<Musica> C = new Vector<Musica>();

        for (int i = men; i <= mitad; i++) {
            B.add(A[i]);
        }
        for (int i = mitad + 1; i <= mayor; i++) {
            C.add(A[i]);
        }

        int i = men;

        while (!B.isEmpty() && !C.isEmpty()) {
            if (B.get(0).getAlbum().compareTo(C.get(0).getAlbum()) < 0) {
                A[i++] = B.get(0);
                B.remove(0);
            } else {
                A[i++] = C.get(0);
                C.remove(0);
            }
        }

        while (!B.isEmpty()) {
            A[i++] = B.get(0);
            B.remove(0);
        }

        while (!C.isEmpty()) {
            A[i++] = C.get(0);
            C.remove(0);
        }
    }
}
