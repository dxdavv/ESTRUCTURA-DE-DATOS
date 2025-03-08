public class Tenis {

    private String marca;
    private String modelo;
    private int talla;

    public Tenis(String marca, String modelo, int talla) {
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTalla() {
        return talla;
    }

    @Override
    public String toString() {

        return "Marca: " + marca + " Modelo: " + modelo + " Talla: " + talla;
    }
}
