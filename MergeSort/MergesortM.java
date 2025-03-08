public class MergesortM {

    public static void main(String[] args) {

        Musica s1 = new Musica ("GIRL", "call me back", 4.24);
        Musica s2 = new Musica ("BOY", "love story", 3.85);
        Musica s3 = new Musica ("MAPS 7", "black swan", 3.45);
        Musica s4 = new Musica ("Wave 0.01", "bonfire", 2.58);
        Musica s5 = new Musica ("0.1 flaws and all", "wave", 3.56);
        Musica s6 = new Musica ("No llora", "No llora", 4.12);
        Musica s7 = new Musica ("Demons", "suffer", 3.37);

        Musica rolas [] = new Musica [7];

        rolas[0] = s1;
        rolas[1] = s7;
        rolas[2] = s5;
        rolas[3] = s3;
        rolas[4] = s6;
        rolas[5] = s2;
        rolas[6] = s4;

        mergesort m = new mergesort(rolas);

        m.merge(0, rolas.length - 1);

        for (Musica i : rolas) {
            System.out.println(i);
        }
    }

}
