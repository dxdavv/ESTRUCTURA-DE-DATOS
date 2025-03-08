package Algoritmos;
import java.util.Comparator;
public class OrdenarIMC implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {

        if (p1.getIMC() > p2.getIMC()) {
            return 1;
        } else {
            return -1;
        }

    }
}