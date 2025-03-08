package Algoritmos;

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
        this.peso = random.nextDouble() * 50 + 40;
        this.altura = random.nextDouble() * 0.4 + 1.5;
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

    public void IMC() {
        imc = peso / (altura * altura);

    }

    public double getIMC() {
        return imc;
    }

    @Override
    public String toString() {
        return String.format(
                "Nombre: %s Edad: %d Peso: %.2f Altura: %.2f IMC: %.2f",
                nombre, edad, peso, altura, imc);
    }
}
