package com.mycompany.ejercicio1_3;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtCifraMayor;
    @FXML private TextField txtCifraMenor;
    @FXML private TextArea txtDivisores;

    @FXML
    private void Analizar() {
        int original = Integer.parseInt(txtNumero.getText());
        int n = original;

        int cantCifras = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int cifraMayor = -1;
        int cifraMenor = 10;

        while (n > 0) {
            int digito = n % 10;
            cantCifras++;
            sumaTotal += digito;

            if (digito % 2 == 0) {
                sumaPares += digito;
            } else {
                sumaImpares += digito;
            }

            if (digito > cifraMayor) {
                cifraMayor = digito;
            }
            if (digito < cifraMenor) {
                cifraMenor = digito;
            }

            n = n / 10;
        }

        StringBuilder divStr = new StringBuilder();
        for (int i = 1; i <= original; i++) {
            if (original % i == 0) {
                divStr.append(i).append("\n");
            }
        }

        txtCantCifras.setText(String.valueOf(cantCifras));
        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtCifraMayor.setText(String.valueOf(cifraMayor));
        txtCifraMenor.setText(String.valueOf(cifraMenor));
        txtDivisores.setText(divStr.toString());
    }

    @FXML
    private void Limpiar() {
        txtNumero.setText("");
        txtCantCifras.setText("");
        txtSumaImpares.setText("");
        txtSumaPares.setText("");
        txtSumaTotal.setText("");
        txtCifraMayor.setText("");
        txtCifraMenor.setText("");
        txtDivisores.setText("");
    }
}