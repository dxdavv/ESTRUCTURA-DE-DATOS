public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro("El principito", 100);
        Libro l2 = new Libro("La dama y el vagabundo", 250);
        Libro l3 = new Libro("La biblia", 1000);
        Libro l4 = new Libro("Harry potter", 2000);
        Libro l5 = new Libro("Los juegos del hambre", 350);
        Libro l6 = new Libro("Autopista sanguijuela", 150);
        Libro l7 = new Libro("La ladrona de libros", 75);
        Libro l8 = new Libro("Twilight", 500);
        Libro l9 = new Libro("El diario de Ana Frank", 384);
        Libro l10 = new Libro("Maze runner", 400);

        Libro[] libros = new Libro[10];
        libros[0] = l10;
        libros[1] = l2;
        libros[2] = l5;
        libros[3] = l8;
        libros[4] = l1;
        libros[5] = l6;
        libros[6] = l3;
        libros[7] = l4;
        libros[8] = l7;
        libros[9] = l9;

        InsertionSort insertion = new InsertionSort(libros);
        insertion.Insertion();

        for (Libro i : libros) {
            System.out.println(i);
        }

    }

}
