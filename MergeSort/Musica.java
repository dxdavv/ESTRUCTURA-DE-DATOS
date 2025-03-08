public class Musica {

    private String album;
    private String nombre;
    private double duracion;

    public Musica (String album, String nombre, double duracion){
        this.album = album;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getAlbum(){
        return album;
    }

    public String getNombre(){
        return nombre;
    }

    public double getDuracion(){
        return duracion;
    }

    @Override
    public String toString(){
        return "Album: " + album + " Nombre: " + nombre + " Duracion: " + duracion;
    }
}
