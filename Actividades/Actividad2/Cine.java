package Actividades.Actividad2;

import java.util.Comparator;

public class Cine {

    private String nCliente;
    private String membresia;
    private String pelicula;

    public Cine(String nombreCliente, String membresia, String pelicula) {
        this.nCliente = nombreCliente;
        this.membresia = membresia;
        this.pelicula = pelicula;
    }

    public String getMembresia() {
        return this.membresia;
    }

    @Override
    public String toString() {
        return "Cliente: " + nCliente + "\nMembresia: " + membresia + "\nPelicula: " + pelicula + "\n";
    }
}

class CineComparador implements Comparator<Cine> {
    @Override
    public int compare(Cine c1, Cine c2) {
        if (c2.getMembresia().equals("VIP") && c1.getMembresia().equals("Clasica")) {
            return 1;
        } else {
            return -1;
        }
    }
}