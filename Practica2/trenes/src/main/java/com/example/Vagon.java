package com.example;

public class Vagon {
    
    private String tipo;
    private int num;

    public Vagon(String tipo, int num){
        this.tipo = tipo;
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public String toString(){
        
        return tipo + '-' + num;
    }
}
