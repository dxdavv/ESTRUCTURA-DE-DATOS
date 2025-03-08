package EXAMEN;

public class Foco {
    
    private String tipo;
    private String marca;
    private int watts;

    public Foco(String tipo, String marca, int watts){
        this.tipo = tipo;
        this.marca = marca;
        this.watts = watts;
    }

    public String getTipo(){
        return tipo;
    }

    public String getMarca(){
        return marca;
    }

    public int getWatts(){
        return watts;
    }

@Override
    public String toString(){
        return String.format("Foco %s marca %s de %d watts", tipo, marca, watts);
    }
}
