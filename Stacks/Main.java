package Stacks;

public class Main {

    public static void main(String[] args) {
        Pila pilar = new Pila();
        pilar.push(7);
        pilar.push(-9);
        pilar.push(4);
        pilar.push(3);
        pilar.push(8);
        pilar.push(0);
        pilar.imprimePila();

        System.out.println("\n"+ pilar.getValorTop());
    
    }
}