package org.example.tikettravel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController {

    @FXML
    private Label welcomeLabel; // Sesuaikan dengan ID yang ada di hello-view.fxml

    @FXML
    private Button pesanSekarangButton; // ID tombol baru

    // Method ini akan dipanggil saat FXML di-load
    @FXML
    public void handlePesanSekarangClick() {
        try {
            // Load FXML baru
            FXMLLoader loader = new FXMLLoader(getClass().getResource("booking-view.fxml"));
            Parent root = loader.load();

            // Dapatkan Stage dari tombol yang ditekan
            Stage stage = (Stage) pesanSekarangButton.getScene().getWindow();

            // Set scene baru
            stage.setScene(new Scene(root, 600, 400));
            stage.setTitle("Pesan Tiket");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        welcomeLabel.setText("Selamat Datang di Aplikasi Tiket Travel");

        pesanSekarangButton.setText("Pesan Tiket");
        pesanSekarangButton.setOnAction(event -> handlePesanSekarangClick());
    }
}