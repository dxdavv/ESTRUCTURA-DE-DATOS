package com.ang;

import javafx.beans.value.ObservableValue;
import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InterfazController {

    private ObservableList<Persona> listapersonas;

    @FXML
    TextField CantidadDatos;

    @FXML
    TableView tablapersonas;

    @FXML
    TableColumn<Persona, String> colNombre;
    /*
     * Cada columna de la tableview lleva su propia variable
     * del lado izquierdo de la coma lleva el tipo de dato que recibe
     * del lado derecho es como lo maneja y muestra en la tableview
     */

    @FXML
    TableColumn<Persona, Integer> colEdad;

    @FXML
    TableColumn<Persona, Double> colPeso;

    @FXML
    TableColumn<Persona, Double> colAltura;

    @FXML
    TableColumn<Persona, Double> colIMC;

    ToggleGroup grupo1 = new ToggleGroup();
    ToggleGroup grupo2 = new ToggleGroup();

    @FXML
    RadioButton Nombre;

    @FXML
    RadioButton Edad;

    @FXML
    RadioButton Peso;

    @FXML
    RadioButton Altura;

    @FXML
    RadioButton IMC;

    @FXML
    RadioButton ASC;

    @FXML
    RadioButton DES;

    @FXML
    Button Llenar;

    @FXML
    Button Ordenar;

    @FXML
    private void salir() {
        System.exit(0);
    }

    public void initialize() {
        colNombre.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
        /*
         * colNombre es la columna de la tablaview que va a recibir un tipo de valor
         * especifico, el nombre que lleva al final en comillas debe ser el mismo que
         * tienen
         * los atributos en la clase de donde se sacan los datos, en este caso es
         * Persona
         */
        colEdad.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("edad"));
        colPeso.setCellValueFactory(new PropertyValueFactory<Persona, Double>("peso"));
        colAltura.setCellValueFactory(new PropertyValueFactory<Persona, Double>("altura"));
        colIMC.setCellValueFactory(new PropertyValueFactory<Persona, Double>("imc"));

        Nombre.setToggleGroup(grupo1);
        Edad.setToggleGroup(grupo1);
        Peso.setToggleGroup(grupo1);
        Altura.setToggleGroup(grupo1);
        IMC.setToggleGroup(grupo1);

        ASC.setToggleGroup(grupo2);
        DES.setToggleGroup(grupo2);

        Nombre.setSelected(true);
        ASC.setSelected(true);
    }

    @FXML
    private void llenar() {
        if (!CantidadDatos.getText().isEmpty()) {
            if (CantidadDatos.getText().compareTo("/") > 0 && CantidadDatos.getText().compareTo(":") < 0) {
                int cantidad = Integer.parseInt(CantidadDatos.getText());
                listapersonas = FXCollections.observableArrayList();
                for (int i = 0; i < cantidad; i++) {
                    listapersonas.add(new Persona());
                }
                tablapersonas.setItems(listapersonas);
            }
        }
    }

    @FXML
    public void ordenar() {
        if (ASC.isSelected()) {
            if (Nombre.isSelected()) {
                listapersonas.sort(new OrdenarNombre());
            } else if (Edad.isSelected()) {
                listapersonas.sort(new OrdenarEdad());
            } else if (Peso.isSelected()) {
                listapersonas.sort(new OrdenarPeso());
            } else if (Altura.isSelected()) {
                listapersonas.sort(new OrdenarAltura());
            } else if (IMC.isSelected()) {
                listapersonas.sort(new OrdenarIMC());
            }

        } else {
            if (Nombre.isSelected()) {
                listapersonas.sort(new OrdenarNombre().reversed());
            } else if (Edad.isSelected()) {
                listapersonas.sort(new OrdenarEdad().reversed());
            } else if (Peso.isSelected()) {
                listapersonas.sort(new OrdenarPeso().reversed());
            } else if (Altura.isSelected()) {
                listapersonas.sort(new OrdenarAltura().reversed());
            } else if (IMC.isSelected()) {
                listapersonas.sort(new OrdenarIMC().reversed());
            }
        }
    }

}
