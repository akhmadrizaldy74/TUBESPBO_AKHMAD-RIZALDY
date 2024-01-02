package org.example.tikettravel;

public class Perjalanan {
    private String tanggalKeberangkatan;
    private String tanggalTiba;
    private String rutePerjalanan;

    private String jenisKendaraan;
    private int hargaTiket;
    private String jenisTravel;

    public Perjalanan(String tanggalKeberangkatan, String tanggalTiba,String jenisKendaraan, String rutePerjalanan, int hargaTiket) {
        this.tanggalKeberangkatan = tanggalKeberangkatan;
        this.tanggalTiba = tanggalTiba;
        this.jenisKendaraan =jenisKendaraan;
        this.rutePerjalanan = rutePerjalanan;
        this.hargaTiket = hargaTiket;
        this.jenisTravel = jenisTravel;
    }

    // Getter dan setter untuk jenis travel
    public String getJenisTravel() {
        return jenisTravel;
    }

    public void setJenisTravel(String jenisTravel) {
        this.jenisTravel = jenisTravel;
    }


    public String getTanggalKeberangkatan() {
        return tanggalKeberangkatan;
    }

    public void setTanggalKeberangkatan(String tanggalKeberangkatan) {
        this.tanggalKeberangkatan = tanggalKeberangkatan;
    }

    public String getRutePerjalanan() {
        return rutePerjalanan;
    }

    public String getJenisKendaraan(){
        return jenisKendaraan;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }
}