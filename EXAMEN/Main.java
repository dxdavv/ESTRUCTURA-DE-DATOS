package EXAMEN;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int tamaño = ent.nextInt();

        Foco focos []= new Foco [tamaño];
        
        for (int i = 0 ; i <tamaño ; i++){
            focos[i] = new Foco(ent.next(), ent.next(), ent.nextInt());
        }

        Algoritmo bubble = new Algoritmo (focos);
        bubble.ordenarFocos();

        for (Foco i : focos){
            System.out.println(i);
        }
    }
}

