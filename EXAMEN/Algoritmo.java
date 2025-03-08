package EXAMEN;


public class Algoritmo {
    
    private Foco [] focos;

    public Algoritmo (Foco [] focos){
        this.focos = focos;
    }

    public void ordenarFocos(){
        for (int i = 0; i < focos.length -1; i++){
            for(int j = 0 ; j < focos.length - 1 ; j++ ){
                if (focos[j].getWatts() < focos[j +1 ].getWatts()){
                    Foco aux = focos[j];
                    focos[j] = focos[j+1];
                    focos[j+1] = aux;
                }
            }
        }
    }
}
