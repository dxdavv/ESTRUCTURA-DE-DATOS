package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Stack;

public class BuscadorController {
    Stack<String> navegador = new Stack<>();
    Stack<String> patras = new Stack<>();

    @FXML
    public TextField URL;

    @FXML
    public TextField Buscar;

    @FXML
    public void BuscarAlgo() {
        if (!Buscar.getText().isEmpty()) { // mientras buscar no este vacio
            patras.clear(); // vamos a borrar lo que se guardo en la pila patras al dar click en atras
            navegador.add(Buscar.getText()); // y en la pila del navegador vamos a añadir el texto ingresado en buscar
            URL.setText(navegador.toString()); // imprimimos con el toString de la pila del navegador para mostar en
            // el campo de URL lo que guardo al momento de escribir en buscar y esta
            // guardado en navegador
            Buscar.clear(); // borramos lo que se escribio en buscar kekeke
        }
    }

    @FXML
    public void Atras() {
        if (!navegador.isEmpty()) { // mientras la pila del navegador no este vacia
            patras.push(navegador.pop()); // vamos a agreagar a la pila de patras lo que se saco de la pila del
                                          // navegador
            // al dar click en atras
            URL.setText(navegador.toString()); // se vuelve a imprimir lo que hay en la pila del navegador
        }
    }

    @FXML
    public void Adelante() {
        if (!patras.isEmpty()) { // mientras la pila patras no este vacia
            navegador.push(patras.pop()); // vamos a agregar de nuevo en navegador lo que se saco de patras para
                                          // regresarlo
            // y que se muestre de nuevo en el url
            URL.setText(navegador.toString());
        }
    }

    @FXML
    public void Salir() {
        System.exit(0);
    }
}
