module com.example.examendesarrollointerfaces {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.examendesarrollointerfaces to javafx.fxml;
    exports com.example.examendesarrollointerfaces;
    exports com.example.examendesarrollointerfaces.controllers;
    opens com.example.examendesarrollointerfaces.controllers to javafx.fxml;
}