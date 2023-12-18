package com.example.examendesarrollointerfaces.controllers;

import com.example.examendesarrollointerfaces.clientes.Cliente;
import com.example.examendesarrollointerfaces.coches.Coche;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;


public class MainViewController implements Initializable {

    @FXML
    private TextField txtMatricula;
    @FXML
    private ComboBox<String> comboModelo;
    @FXML
    private ComboBox<Cliente> comboCliente;
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
    private TableView<Coche> tvParking;
    @FXML
    private TableColumn<Coche, String> cMatricula;
    @FXML
    private TableColumn<Coche, String> cModelo;
    @FXML
    private TableColumn<Coche, String> cFechaEntrada;
    @FXML
    private TableColumn<Coche, String> cFechaSalida;
    @FXML
    private TableColumn<Coche, String> cCliente;
    @FXML
    private TableColumn<Coche, String> cTarifa;
    @FXML
    private TableColumn<Coche, String> cCoste;
    @FXML
    private Label lblInfo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void añadir(ActionEvent actionEvent) {
        if (!txtMatricula.getText().isEmpty()){
            Coche coche = new Coche();
            coche.setMatricula(txtMatricula.getText());
            coche.setModelo(comboModelo.getSelectionModel().getSelectedItem());
            coche.setCliente(comboCliente.getSelectionModel().getSelectedItem());

            //Añadir a la tabla lo que acabamos de poner al darle al boton
            tvParking.getItems().add(coche);
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("No ha introducido todos los datos");
            alert.show();
        }
    }

    @FXML
    public void salir(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void infoAlumno(Event event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText("Nombre: Jorge Olmedo Jiménez" + "\nCiclo: 2 DAM");
        alert.show();
    }
}