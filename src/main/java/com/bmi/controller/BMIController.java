
package com.bmi.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {

    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Label lblHasil;

    @FXML
    private Label lblKategori;

    @FXML
    private void hitungBMI() {

        try {
            String nama = txtNama.getText().trim();

            double berat = Double.parseDouble(
                txtBerat.getText().trim().replace(",", ".")
            );

            double tinggi = Double.parseDouble(
                txtTinggi.getText().trim().replace(",", ".")
            );

            if (nama.isEmpty()) {
                lblHasil.setText("Nama harus diisi!");
                lblKategori.setText("");
                return;
            }

            if (berat <= 0 || tinggi <= 0) {
                lblHasil.setText("Input harus lebih dari 0!");
                lblKategori.setText("");
                return;
            }

            double tinggiMeter = tinggi / 100;

            double bmi = berat /
                (tinggiMeter * tinggiMeter);

            lblHasil.setText(
                String.format("%.2f", bmi)
            );

            if (bmi < 18.5) {
                lblKategori.setText("Kurus");
            } else if (bmi < 25) {
                lblKategori.setText("Normal");
            } else if (bmi < 30) {
                lblKategori.setText("Overweight");
            } else {
                lblKategori.setText("Obesitas");
            }

        } catch (NumberFormatException e) {
            lblHasil.setText("Masukkan angka yang valid!");
            lblKategori.setText("");
        }
    }

    @FXML
    private void resetBMI() {

        txtNama.clear();
        txtBerat.clear();
        txtTinggi.clear();

        lblHasil.setText("0.00");
        lblKategori.setText("");
    }
}
