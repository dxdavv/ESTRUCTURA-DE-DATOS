package Actividades.Actividad1;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Stack<Telefono> desordenada = new Stack<Telefono>();
        Stack<Telefono> samsung = new Stack<Telefono>();
        Stack<Telefono> iphone = new Stack<Telefono>();
        Stack<Telefono> baratoS = new Stack<Telefono>();
        Stack<Telefono> caroS = new Stack<Telefono>();
        Stack<Telefono> baratoI = new Stack<Telefono>();
        Stack<Telefono> caroI = new Stack<Telefono>();

        desordenada.push(new Telefono ("13", "Iphone", 11000));
        desordenada.push(new Telefono ("15", "Iphone", 20000));
        desordenada.push(new Telefono ("S25", "Samsung", 16000));
        desordenada.push(new Telefono("A55","Samsung", 6500));
        desordenada.push(new Telefono ("16", "Iphone", 30000));
        desordenada.push(new Telefono ("8", "Iphone", 10000));
        desordenada.push(new Telefono("A54", "Samsung", 6000));
        desordenada.push(new Telefono ("A03", "Samsung", 4000));+

        System.out.println("Desordenados:\n");
        System.out.println(desordenada + "\n");
        
        while(!desordenada.isEmpty()){
            if(desordenada.peek().getMarca().compareTo("Iphone")== 0){
                iphone.push(desordenada.pop());
            } else{
                samsung.push(desordenada.pop());
            }
        }

        System.out.println("Ordenados por Marca Iphone\n");
        System.out.println(iphone);
        System.out.println("\nOrdenados por Marca Samsung\n");
        System.out.println(samsung);

        while(!iphone.isEmpty()){
            if(iphone.peek().getPrecio() < 15000){
                baratoI.push(iphone.pop());
            } else{
                caroI.push(iphone.pop());
            }
        }

        while(!samsung.isEmpty()){
            if(samsung.peek().getPrecio() < 10000){
                baratoS.push(samsung.pop());
            } else{
                caroS.push(samsung.pop());
            }
        }

        System.out.println("\nOrdenados por barato y caro: Iphone\n");
        System.out.println(baratoI);
        System.out.println("\n"+ caroI);

        System.out.println("\nOrdenados por barato y caro: Samsung\n");
        System.out.println(baratoS);
        System.out.println("\n"+ caroS);


    }

}
