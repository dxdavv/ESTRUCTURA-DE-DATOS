package Actividades.Actividad1;

public class Telefono {

    private String modelo;
    private String marca;
    private int precio;

    public Telefono(String modelo, String marca, int precio){
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getPrecio() {
        return precio;
    }

@Override
    public String toString() {
        return "Telefono{" + "modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + '}';
    }

}
