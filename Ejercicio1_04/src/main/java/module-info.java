module com.mycompany.ejercicio1_04 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1_04 to javafx.fxml;
    exports com.mycompany.ejercicio1_04;
}
