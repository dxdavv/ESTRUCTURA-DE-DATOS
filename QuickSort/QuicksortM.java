public class QuicksortM {
    
    public static void main(String[] args) {

        Tenis t1 = new Tenis ("Nike", "AirMax", 27);
        Tenis t2 = new Tenis ("Jordan", "AirMax", 24);
        Tenis t3 = new Tenis ("Reebok", "Nike", 28);
        Tenis t4 = new Tenis ("Panam", "Ligero", 25);
        Tenis t5 = new Tenis ("Adidas", "Superstar", 26);
        Tenis t6 = new Tenis ("Puma", "Roma", 29);
        Tenis t7 = new Tenis ("Converse", "AllStar", 30);

        Tenis papos [] = new Tenis [7];
        papos [0] = t1;
        papos [1] = t7;
        papos [2] = t3;
        papos [3] = t5;
        papos [4] = t2;
        papos [5] = t6;
        papos [6] = t4;

        Quicksort teni = new Quicksort(papos);
        teni.quicksort(0, papos.length - 1);

        for ( Tenis i : papos) {
            System.out.println(i);
        }
        
    }
}
