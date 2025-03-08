public class Moneda {

    private int denominacion;
    private String divisa;

    public Moneda(int denominacion, String divisa) {
        this.denominacion = denominacion;
        this.divisa = divisa;
    }

    public int getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "denominacion=" + denominacion +
                ", divisa='" + divisa + '\'' +
                '}';
    }

}
