module com.uisil.prueba_chuz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.uisil.prueba_chuz to javafx.fxml;
    exports com.uisil.prueba_chuz;
}
