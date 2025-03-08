public class InsertionSort {

    private Libro[] A;

    public InsertionSort(Libro[] A) {
        this.A = A;
    }

    public void Insertion() {

        Libro val;
        int j;
        for (int i = 0; i <= A.length - 1; i++) {
            val = A[i];
            j = i - 1;
            while (j >= 0 && A[j].getTitulo().compareTo(val.getTitulo()) > 0) {
                /*
                 * CompareTo sirve para comparar palabras, saber si en codigo ASCII una palabra
                 * es mayor que otra
                 * y el > 0 sirve para que si el primer titulo es mayor que el segundo, entonces
                 * regresa un numero mayor
                 * a 0 y se ejecuta lo que hay dentro del while
                 */
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = val;
        }
    }
}
