import java.util.Arrays;
import Algoritmos.Persona;
import Algoritmos.InsertionSort;
import Algoritmos.BinarySearch;
import Algoritmos.Bubblesort;
import Algoritmos.Quicksort;
import Algoritmos.OrdenarIMC;

public class PersonaM {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();
        Persona p7 = new Persona();
        Persona p8 = new Persona();
        Persona p9 = new Persona();
        Persona p10 = new Persona();
        Persona p11 = new Persona();
        Persona p12 = new Persona();
        Persona p13 = new Persona();
        Persona p14 = new Persona();
        Persona p15 = new Persona();

        Persona personas[] = new Persona[15];
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;
        personas[4] = p5;
        personas[5] = p6;
        personas[6] = p7;
        personas[7] = p8;
        personas[8] = p9;
        personas[9] = p10;
        personas[10] = p11;
        personas[11] = p12;
        personas[12] = p13;
        personas[13] = p14;
        personas[14] = p15;

        System.out.println("Personas desordenadas:");
        for (Persona i : personas) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Personas ordenadas por nombre:");

        InsertionSort nombre = new InsertionSort(personas);
        nombre.Insertion();

        for (Persona i : personas) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Personas ordenadas por edad:");

        Bubblesort edad = new Bubblesort(personas);
        edad.ordenar();

        for (Persona i : personas) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Personas ordenadas por altura:");
        Quicksort altura = new Quicksort(personas);
        altura.quicksort(0, personas.length - 1);

        for (Persona i : personas) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Personas ordenadas por IMC:");
        Arrays.sort(personas, new OrdenarIMC().reversed());
        // Arrays.sort(personas, (a, b) -> a.getIMC() > b.getIMC() ? 1 : -1);
        // Este sirve para generar un comparador pero sin crearlo aparte ya que
        // se crea aquí mismo y si es verdad regresa el 1 y sino regresa el -1
        for (Persona i : personas) {
            System.out.println(i);
        }

        System.out.println();
        edad.ordenar();
        BinarySearch busqueda = new BinarySearch(personas);
        System.out.println(
                "La posición de la edad buscada es: " + busqueda.binarySearch(0, personas.length - 1, p1.getEdad()));
        System.out.println(busqueda);
    }
}