public class BubblesortM {
    public static void main(String[] args) {

        int[] a = { 6, 8, 2, 4, 9, 3, 1 };

        Bubblesort bubble = new Bubblesort(a);
        bubble.ordenar();

        for (int i : a) {
            System.out.println(i);
        }
    }
}
