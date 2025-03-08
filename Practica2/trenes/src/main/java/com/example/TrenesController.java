package com.example;

import java.util.Random;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class TrenesController {

    Vector<Vagon> vagon = new Vector<>(); // vector para crear los vagones y agregarlos junto con el random
    Random random = new Random();
    Queue<Vagon> tren = new LinkedList<>(); // cola donde van desordenados los vagones
    Queue<Vagon> trenA = new LinkedList<>(); // cola que va a guardar los vagones al irse ordenando
    Queue<Vagon> trenB = new LinkedList<>(); // lo mismo de arriba pero para B
    @FXML
    public TextField trenesA;

    @FXML
    public TextField trenesB;

    @FXML
    public TextArea mostrar;

    @FXML
    public void Ordenar() {
        tren.clear(); // borrar todo si se quedo algo para cuando se vuelva a ejecutar
        trenA.clear();
        trenB.clear();
        mostrar.clear();
        if (!trenesA.getText().isEmpty() && !trenesB.getText().isEmpty()) { // mientras que los textos de los vagones no
                                                                            // esten vacios
            for (int i = 0; i < Integer.parseInt(trenesA.getText()); i++) { // vamos a crear todos los vagones de A y de
                                                                            // B
                vagon.add(new Vagon("A", i + 1)); // los agregamos al vector de vagones y en el num asignamos desde el 1
                                                  // hasta n
            }
            for (int i = 0; i < Integer.parseInt(trenesB.getText()); i++) {
                vagon.add(new Vagon("B", i + 1));
            }
            while (!vagon.isEmpty()) {
                tren.add(vagon.remove(random.nextInt(vagon.size()))); // agregamos al tren los vagones ya creados pero
                                                                      // con el random de manera aleatoria
            }

            mostrar.appendText("Tren: " + tren.toString() + "\n\n"); // mostramos el tren con los vagones desordenados

            while (!tren.isEmpty()) { // mientras que el tren no este vacio
                Vagon aux = tren.remove(); // vamos a obtener el primero de tren y checamos si es el que debe ir primero
                                           // en la cola A o B y sino, lo manda atras a encolar
                if (aux.getTipo().equals("A")) { // checamos si el tipo del vagon que sacamos es A
                    if (trenA.isEmpty()) { // si la cola A esta vacia
                        if (aux.getNum() == 1) { // y si el numero del vagon es igual a 1 entonce lo agregamos a la cola
                                                 // A
                            trenA.add(aux);
                        } else {
                            tren.add(aux); // si no es asi, entonces se encola de nuevo en el tren
                        }
                    } else {
                        Queue<Vagon> auxTren = new LinkedList<>(trenA); // vamos a hacer una copia de la cola del tren
                                                                        // completo para obtener el
                        // ultimo valor y asi saber si el que sacamos del tren es el que sigue del
                        // ultimo en la cola del tren A
                        while (auxTren.size() != 1) { // con este sacamos todos los valores de la copia del tren para
                                                      // solo quedarnos con el ultimo
                            auxTren.remove();
                        }
                        if (auxTren.poll().getNum() + 1 == aux.getNum()) { // si ya llegamos al ultimo y su numero + 1
                                                                           // es igual al num del vagon del tren
                                                                           // completo auxiliar que sacamos
                            // entonces lo agregamos a la cola del tren A
                            trenA.add(aux);
                        } else {
                            tren.add(aux); // sino, se regresa a la cola del tren 
                        }
                    }
                } else {
                    if (trenB.isEmpty()) { // lo mismo de arriba pero para b 
                        if (aux.getNum() == 1) {
                            trenB.add(aux);
                        } else {
                            tren.add(aux);
                        }
                    } else {
                        Queue<Vagon> auxTren = new LinkedList<>(trenB);
                        while (auxTren.size() != 1) {
                            auxTren.remove();
                        }
                        if (auxTren.poll().getNum() + 1 == aux.getNum()) {
                            trenB.add(aux);
                        } else {
                            tren.add(aux);
                        }
                    }
                }
                mostrar.appendText("Tren: " + tren.toString() + "\n"); // imprimimos en cada ordenacion lo que tiene tren y cada tren A y B 
                mostrar.appendText("Empresa A: " + trenA.toString() + "\n");
                mostrar.appendText("Empresa B: " + trenB.toString() + "\n\n");
            }
            trenesA.clear(); // limpiamos los espacios donde se meten los valores de la cantidad de vagones
            trenesB.clear();
        }
    }

    @FXML
    public void Salir() {
        System.exit(0);
    }
}
