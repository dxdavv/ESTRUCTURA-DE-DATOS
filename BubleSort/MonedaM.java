
public class MonedaM {
    public static void main(String[] args) {

        Moneda m1 = new Moneda(5, "mexicanos");
        Moneda m2 = new Moneda(100000, "yenes");
        Moneda m3 = new Moneda(500, "dolares");
        Moneda m4 = new Moneda(20, "euros");
        Moneda m5 = new Moneda(2000, "soles");
        Moneda m6 = new Moneda(1200, "wones");
        Moneda m7 = new Moneda(75, "bath");
        Moneda m8 = new Moneda(9500, "rupias");

        Moneda[] monedas = new Moneda[8];
        monedas[0] = m7;
        monedas[2] = m8;
        monedas[1] = m6;
        monedas[3] = m1;
        monedas[4] = m2;
        monedas[5] = m5;
        monedas[6] = m3;
        monedas[7] = m4;

        Bubblesort burbuja = new Bubblesort(monedas);
        burbuja.ordenar();

        for (Moneda i : monedas) {
            System.out.println(i);

        }

    }
}
