package com.example;
import java.util.Comparator;

public class Proceso {
    
    private int id;
    private int priority;

    public Proceso(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

}

class procesoComparador implements Comparator<Proceso>{
    @Override
    public int compare(Proceso p1, Proceso p2){
        return p1.getPriority() - p2.getPriority();
    }
}