package com.ang;

import java.util.Comparator;
import java.util.Random;

public class Persona {

    Random random = new Random();
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private double imc;
    private String nombres[] = new String[] { "Ana", "Juan", "María", "Pedro", "Lucia",
            "José", "Elena", "Carlos", "Laura", "Miguel", "Sofía", "Manuel", "Isabel", "Luis", "Teresa" };

    public Persona() {
        this.nombre = nombres[random.nextInt(15)];
        this.edad = random.nextInt(85) + 1;
        this.peso = ((int) ((random.nextDouble() * 50 + 40) * 100)) / 100.00;
        this.altura = ((int) ((random.nextDouble() * 0.4 + 1.5) * 100)) / 100.00;
        IMC();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void IMC() {
        this.imc = ((int) ((peso / (altura * altura)) * 100)) / 100.00;

    }

    public double getImc() {
        return imc;
    }

    @Override
    public String toString() {
        return String.format(
                "Nombre: %s Edad: %d Peso: %.2f Altura: %.2f IMC: %.2f",
                nombre, edad, peso, altura, imc);
    }
}

class OrdenarNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}

class OrdenarEdad implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getEdad() > p2.getEdad()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class OrdenarPeso implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getPeso() > p2.getPeso()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class OrdenarAltura implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getAltura() > p2.getAltura()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class OrdenarIMC implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getImc() > p2.getImc()) {
            return 1;
        } else {
            return -1;
        }
    }
}
