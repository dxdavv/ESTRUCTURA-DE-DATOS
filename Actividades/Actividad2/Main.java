package Actividades.Actividad2;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        
        PriorityQueue<Cine> cines = new PriorityQueue<Cine>(new CineComparador());
        PriorityQueue<Cine> mClasica = new PriorityQueue<Cine>(new CineComparador());
        PriorityQueue<Cine> mPremium = new PriorityQueue<Cine>(new CineComparador());

        Cine raul = new Cine("Raul", "Clasica", "El Rey Leon");
        cines.add(raul); // .add()
        cines.add(new Cine("Sofia", "VIP", "Nosferatu"));
        cines.add(new Cine("Omar", "Clasica", "Mi villano favorito"));
        cines.add(new Cine("Eric", "Clasica", "La cumbre escarlata"));
        cines.add(new Cine("Eugenio", "VIP", "El resplandor"));

        System.out.println("Clientes desordenados: ");
        System.out.println(cines);
        
        if(cines.contains(raul)){ // .contains()
            System.out.println("\nEl cliente ya está registrado");
        }
        
        System.out.println("\nClientes ordenados por membresía: \n");
        for(Cine c : cines){
            System.out.println(c);
        }

        while(!cines.isEmpty()){ // .isEmpty()
            Cine c = cines.poll(); // .poll()
            if(c.getMembresia().equals("VIP")){
                mPremium.add(c);
            } else {
                mClasica.add(c);
            }
        }

        System.out.println("\nClientes ordenados en cola VIP\n");
        for (Cine cliente : mPremium) {
            System.out.println(cliente);
        }

        System.out.println("\nClientes ordenados en cola Clasica\n");
        for (Cine cliente : mClasica) {
            System.out.println(cliente);
        }

        System.out.println("\n Se elimina un cliente de la cola\n");

        mClasica.remove(); // .remove()

        for (Cine cliente : mClasica) {
            System.out.println(cliente);
        }
        
        System.out.println("\nTodos los clientes VIP ingresaron, cola vacía\n");

        mPremium.clear(); // .clear()

        for (Cine cliente : mPremium) {
            System.out.println(cliente);
        }


    }
}
