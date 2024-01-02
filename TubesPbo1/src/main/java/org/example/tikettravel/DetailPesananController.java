package org.example.tikettravel;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DetailPesananController {

    @FXML
    private Label namaPenumpangLabel;

    @FXML
    private Label tanggalKeberangkatanLabel;

    @FXML
    private Label rutePerjalananLabel;

    @FXML
    private Label jeniskendaraanComboBox;

    @FXML
    private Label hargaLabel;

    public void initData(Tiket tiket) {
        Penumpang penumpang = tiket.getPenumpang();
        Perjalanan perjalanan = tiket.getPerjalanan();

        namaPenumpangLabel.setText(penumpang.getNama());
        tanggalKeberangkatanLabel.setText(perjalanan.getTanggalKeberangkatan());
        jeniskendaraanComboBox.setText(perjalanan.getJenisKendaraan());
        rutePerjalananLabel.setText(perjalanan.getRutePerjalanan());
        hargaLabel.setText(String.format("%,d", perjalanan.getHargaTiket()));
    }
}