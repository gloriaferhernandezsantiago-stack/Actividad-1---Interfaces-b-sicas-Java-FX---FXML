package com.mycompany.ejercicio1_2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;
    @FXML
    private TextArea txtConceptos;
    @FXML
    private TextArea txtCantidades;

    @FXML
    private void Desglosar() {
        int dinero = Integer.parseInt(txtDinero.getText());

        int b500 = dinero / 500;
        dinero = dinero % 500;

        int b200 = dinero / 200;
        dinero = dinero % 200;

        int b100 = dinero / 100;
        dinero = dinero % 100;

        int b50 = dinero / 50;
        dinero = dinero % 50;

        int b20 = dinero / 20;
        dinero = dinero % 20;

        int m10 = dinero / 10;
        dinero = dinero % 10;

        int m5 = dinero / 5;
        dinero = dinero % 5;

        int m2 = dinero / 2;
        dinero = dinero % 2;

        int m1 = dinero / 1;

        txtConceptos.setText(
            "Billetes de $500\n" +
            "Billetes de $200\n" +
            "Billetes de $100\n" +
            "Billetes de $50\n" +
            "Billetes de $20\n" +
            "Monedas de $10\n" +
            "Monedas de $5\n" +
            "Monedas de $2\n" +
            "Monedas de $1"
        );

        txtCantidades.setText(
            b500 + "\n" +
            b200 + "\n" +
            b100 + "\n" +
            b50 + "\n" +
            b20 + "\n" +
            m10 + "\n" +
            m5 + "\n" +
            m2 + "\n" +
            m1
        );
    }

    @FXML
    private void Limpiar() {
        txtDinero.setText("");
        txtConceptos.setText("");
        txtCantidades.setText("");
    }
}