package com.example;

import java.io.IOException;
import java.util.PriorityQueue;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProcesosController {

    private ObservableList<Proceso> procesos;
    private PriorityQueue<Proceso> cola = new PriorityQueue<>(new procesoComparador());

    @FXML
    public TextField ID_entrada;

    @FXML
    public TextField ID_salida;

    @FXML
    public TextField Prioridad_entrada;

    @FXML
    public TextField Prioridad_salida;

    @FXML
    public TableView Tabla;

    @FXML
    public TableColumn ID;

    @FXML
    public TableColumn Prioridad;

    @FXML
    private void salir() {
        System.exit(0);
    }

    @FXML
    public void Encolar() {
        if (!ID_entrada.getText().isEmpty() && !Prioridad_entrada.getText().isEmpty()) {
            Proceso proceso = new Proceso(Integer.parseInt(ID_entrada.getText()),
                    Integer.parseInt(Prioridad_entrada.getText()));
            procesos.add(proceso);
            cola.add(proceso);
            Tabla.setItems(procesos);
            ID_entrada.clear();
            Prioridad_entrada.clear();
        }
    }

    @FXML
    public void initialize() {
        procesos = FXCollections.observableArrayList();
        ID.setCellValueFactory(new PropertyValueFactory<Proceso, Integer>("id"));
        Prioridad.setCellValueFactory(new PropertyValueFactory<Proceso, Integer>("priority"));
    }

    @FXML
    public void Procesar() {
        ID_salida.clear();
        Prioridad_salida.clear();
        if (procesos.size() > 0) {
            Proceso remover = cola.poll();
            procesos.remove(remover);
            ID_salida.setText(Integer.toString(remover.getId()));
            Prioridad_salida.setText(Integer.toString(remover.getPriority()));
            Tabla.setItems(procesos);

        }
    }

}
