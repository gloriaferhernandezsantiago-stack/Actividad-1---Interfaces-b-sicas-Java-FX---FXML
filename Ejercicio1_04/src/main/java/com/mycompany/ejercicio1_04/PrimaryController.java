package com.mycompany.ejercicio1_04;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtEntrada;
    
    @FXML
    private TextArea txtTabla;

    @FXML
    private void Calcular() {
        int num = Integer.parseInt(txtEntrada.getText());
        StringBuilder res = new StringBuilder();
        
        for (int i = 1; i <= 10; i++) {
            int mult = num * i;
            res.append(num).append("x").append(i).append(" = ").append(mult).append("\n");
        }
        
        txtTabla.setText(res.toString());
    }

    @FXML
    private void Limpiar() {
        txtEntrada.setText("");
        txtTabla.setText("");
    }
}