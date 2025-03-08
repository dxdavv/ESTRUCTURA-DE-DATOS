package Algoritmos;

public class BinarySearch {

    private Persona [] A;
    private int iteraciones = 0;

    public BinarySearch(Persona [] A) {
        this.A = A;
    }

    public int binarySearch (int izq, int der, int buscar){
        iteraciones++;
        if (izq <= der) {
            int mitad = izq +(der - izq)/2;
            if (A[mitad].getEdad()==buscar){
                return mitad;
            }
            if (A[mitad].getEdad()> buscar){
                return binarySearch(izq, mitad-1,buscar);
            }
            if (A[mitad].getEdad() < buscar){
                return binarySearch(mitad+1, der, buscar);
            }
        }
            return -1;
        }

        @Override
        public String toString(){
            return "La cantidad de iteraciones realizadas para encontrar el numero fueron: " + iteraciones;
        }
    }