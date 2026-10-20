package com.mycompany.ejercicio1_5;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController{
    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    
    @FXML private TextField txtTotalSemanal;
    @FXML private TextField txtGastoMasAlto;
    
    @FXML
    private void CalcularEstadisticas() {
        double alimentacion = Double.parseDouble(txtAlimentacion.getText());
        double refrigerios = Double.parseDouble(txtRefrigerios.getText());
        double transporte = Double.parseDouble(txtTransporte.getText());
        double telefonia = Double.parseDouble(txtTelefonia.getText());
        double otros = Double.parseDouble(txtOtros.getText());

        double total = alimentacion + refrigerios + transporte + telefonia + otros;
        txtTotalSemanal.setText(String.valueOf(total));

        double mayor = alimentacion;
        String categoria = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            categoria = "Refrigerios";
        }
        if (transporte > mayor) {
            mayor = transporte;
            categoria = "Transporte";
        }
        if (telefonia > mayor) {
            mayor = telefonia;
            categoria = "Telefonía";
        }
        if (otros > mayor) {
            mayor = otros;
            categoria = "Otros";
        }

        txtGastoMasAlto.setText(categoria);
    }

    @FXML
    private void Limpiar() {
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotalSemanal.setText("");
        txtGastoMasAlto.setText("");
    }
}