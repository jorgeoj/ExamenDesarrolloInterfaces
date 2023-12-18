package com.example.examendesarrollointerfaces.controllers;

import com.example.examendesarrollointerfaces.clientes.Cliente;
import com.example.examendesarrollointerfaces.coches.Coche;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        Cliente c1 = new Cliente("1","Francisco", "francisco@gmail.com");
        Cliente c2 = new Cliente("2","Jorge", "jorge@gmail.com");
        Cliente c3 = new Cliente("3","Rafael", "rafa@gmail.com");

        tvParking.getItems().add(new Coche("1234A", "Audi", c1, "Standart", LocalDate.of(2023, 12, 3),
                LocalDate.of(2023, 12, 7), 40.0));
        tvParking.getItems().add(new Coche("5678B", "Mercedes", c2, "Oferta", LocalDate.of(2023, 12, 5),
                LocalDate.of(2023, 12, 6), 12.0));
        tvParking.getItems().add(new Coche("9101C", "Mini", c3, "Larga duracion", LocalDate.of(2023, 12, 1),
                LocalDate.of(2023, 12, 10), 20.0));


        ObservableList<String> modelos = FXCollections.observableArrayList();
        modelos.addAll("Audi", "Hyundai", "Mercedes", "Ford", "Mini");
        comboModelo.getItems().addAll(modelos);
        comboModelo.getSelectionModel().selectFirst();

        comboCliente.getItems().addAll(c1, c2, c3);
        comboCliente.getSelectionModel().selectFirst();

        cMatricula.setCellValueFactory((fila) ->{
            var salida = fila.getValue().getMatricula();
            return new SimpleStringProperty(salida);
        });
        cModelo.setCellValueFactory((fila) ->{
            var salida = fila.getValue().getModelo();
            return new SimpleStringProperty(salida);
        });
        cFechaEntrada.setCellValueFactory((fila)->{
            LocalDate fecha = fila.getValue().getFechaEntrada();
            // Definir el formato deseado para la fecha (día/mes/año)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            // Formatear la fecha al nuevo formato
            String fechaFormateada = fecha.format(formatter);
            return new SimpleStringProperty(fechaFormateada);
        });
        cFechaSalida.setCellValueFactory((fila)->{
            LocalDate fecha = fila.getValue().getFechaSalida();
            // Definir el formato deseado para la fecha (día/mes/año)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            // Formatear la fecha al nuevo formato
            String fechaFormateada = fecha.format(formatter);
            return new SimpleStringProperty(fechaFormateada);
        });
        cCliente.setCellValueFactory((fila) ->{
            var salida = fila.getValue().getCliente().getNombre();
            return new SimpleStringProperty(salida);
        });
        cTarifa.setCellValueFactory((fila) ->{
            var salida = fila.getValue().getTipoTarifa();
            return new SimpleStringProperty(salida);
        });
        cCoste.setCellValueFactory((fila) ->{
            var salida = fila.getValue().getCosteTotal() +" €";
            return new SimpleStringProperty(salida);
        });


    }

    @FXML
    public void añadir(ActionEvent actionEvent) {
        Alert alert = new Alert( Alert.AlertType.WARNING );
        if(txtMatricula.getText().isEmpty()){
            alert.setContentText( "El campo matricula no puede estar vacio" );
            alert.show();
        }
        else if(dateEntrada.getValue()==null){
            alert.setContentText( "debe seleccionar una fecha de entrada" );
            alert.show();
        }
        else if(dateSalida.getValue()==null){
            alert.setContentText( "debe seleccionar una fecha de salida" );
            alert.show();
        }
        /*Comprobar tarifa*/
        else{
            Cliente cliente = new Cliente();
            Coche coche = new Coche(txtMatricula.getText(), comboModelo.getValue(), cliente, /*Campo tarifa*/, dateEntrada.getValue() , dateSalida.getValue());
            cliente.setNombre(String.valueOf(comboCliente.getValue()));
            ObservableList<Coche> observableCoches= FXCollections.observableArrayList();
            observableCoches.add( coche );
            tvParking.setItems( observableCoches );
            txtMatricula.setText( "" );
            dateEntrada.setValue( null );
            dateSalida.setValue( null );
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