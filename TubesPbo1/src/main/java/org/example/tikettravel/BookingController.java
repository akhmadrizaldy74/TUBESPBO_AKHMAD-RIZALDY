package org.example.tikettravel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BookingController {

    @FXML
    private TextField namaPenumpangField;

    @FXML
    private DatePicker tanggalKeberangkatanPicker;

    @FXML
    private ComboBox<String> rutePerjalananComboBox;

    @FXML
    private ComboBox<String> jeniskendaraanComboBox;

    @FXML
    private Button konfirmasiButton;

    @FXML
    private Label hargaLabel;

    @FXML
    private void initialize() {
        rutePerjalananComboBox.getItems().addAll(
                "Rute Jakarta-Bandung",
                "Rute Bandung-Yogyakarta",
                "Rute Yogyakarta-Surabaya",
                "Rute Malang-Jakarta",
                "Rute Jakarta-Banyuwangi",
                "Rute Jakarta-Kebumen"
        );

        jeniskendaraanComboBox.getItems().addAll(
                " Bus High Decker (HD)",
                "Bus Ultra High Decker (UHD)",
                "Bus Super High Decker (SHD)",
                "Bus High Decker Double Glass (HDD)",
                "Mini Bus Pagi",
                "Mini Bus Malam"
        );

        if (konfirmasiButton != null) {
            konfirmasiButton.setOnAction(event -> handleKonfirmasiClick());
        }

        Map<String, Integer> hargaTiket = new HashMap<>();
        hargaTiket.put("Rute Jakarta-Bandung", 100000);
        hargaTiket.put("Rute Bandung-Yogyakarta", 200000);
        hargaTiket.put("Rute Yogyakarta-Surabaya", 300000);
        hargaTiket.put("Rute Malang-Jakarta", 500000);
        hargaTiket.put("Rute Jakarta-Banyuwangi", 600000);
        hargaTiket.put("Rute Jakarta-Kebumen", 400000);

        rutePerjalananComboBox.valueProperty().addListener((observable, oldValue, newValue) -> {
            hargaLabel.setText(String.format("%,d", hargaTiket.get(newValue)));
        });
    }

    @FXML
    private void handleKonfirmasiClick() {
        if (namaPenumpangField.getText().isEmpty() ||
                tanggalKeberangkatanPicker.getValue() == null ||
                rutePerjalananComboBox.getValue() == null ||
                jeniskendaraanComboBox.getValue() == null) {

            // Tampilkan peringatan jika ada field yang kosong
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Peringatan");
            alert.setHeaderText(null);
            alert.setContentText("Harap isi semua kolom terlebih dahulu!");
            alert.showAndWait();
        } else {
            // Lakukan proses jika semua field sudah terisi
            Penumpang penumpang = new Penumpang(namaPenumpangField.getText(), "", "", "");
            String selectedRoute = rutePerjalananComboBox.getValue();
            String selectedCar = jeniskendaraanComboBox.getValue();
            int selectedPrice = getPriceForRoute(selectedRoute);
            Perjalanan perjalanan = new Perjalanan(tanggalKeberangkatanPicker.getValue().toString(), "", selectedCar, selectedRoute, selectedPrice);
            Tiket tiket = new Tiket(penumpang, perjalanan);
            tiket.save();

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("detail-pesanan-view.fxml"));
                Parent root = loader.load();

                DetailPesananController controller = loader.getController();
                controller.initData(tiket);

                Stage stage = new Stage();
                stage.setTitle("Detail Pesanan");
                stage.setScene(new Scene(root, 400, 400));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private int getPriceForRoute(String route) {
        Map<String, Integer> hargaTiket = new HashMap<>();
        hargaTiket.put("Rute Jakarta-Bandung", 100000);
        hargaTiket.put("Rute Bandung-Yogyakarta", 200000);
        hargaTiket.put("Rute Yogyakarta-Surabaya", 300000);
        hargaTiket.put("Rute Malang-Jakarta", 500000);
        hargaTiket.put("Rute Jakarta-Banyuwangi", 600000);
        hargaTiket.put("Rute Jakarta-Kebumen", 400000);

        return hargaTiket.getOrDefault(route, 0);
    }
}