package com.example.examendesarrollointerfaces.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;


public class MainViewController implements Initializable {

    @FXML
    private TextField txtMatricula;
    @FXML
    private ComboBox comboModelo;
    @FXML
    private ComboBox comboCliente;
    @FXML
    private RadioButton radioStandart;
    @FXML
    private RadioButton radioOferta;
    @FXML
    private RadioButton radioLargaDuracion;
    @FXML
    private DatePicker dateEntrada;
    @FXML
    private DatePicker dateSalida;
    @FXML
    private Label lblPrecio;
    @FXML
    private Button btnAñadir;
    @FXML
    private Button btnSalir;
    @FXML
    private TableView tvParking;
    @FXML
    private TableColumn cMatricula;
    @FXML
    private TableColumn cModelo;
    @FXML
    private TableColumn cFechaEntrada;
    @FXML
    private TableColumn cFechaSalida;
    @FXML
    private TableColumn cCliente;
    @FXML
    private TableColumn cTarifa;
    @FXML
    private TableColumn cCoste;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void añadir(ActionEvent actionEvent) {
    }

    @FXML
    public void salir(ActionEvent actionEvent) {
        System.exit(0);
    }


}