package org.example.tikettravel;

public class Tiket {

    private Penumpang penumpang;
    private Perjalanan perjalanan;

    private boolean statusPembatalan;
    private int hargaTiket;

    public Tiket(Penumpang penumpang, Perjalanan perjalanan) {
        this.penumpang = penumpang;
        this.perjalanan = perjalanan;
        this.statusPembatalan = false;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public void save() {
        // Implement the logic to save the tiket data
        // For example, you might write to a file or database here
    }
    public int getHargaTiket() {
        // Implement the logic to return the hargaTiket value
        return this.hargaTiket;  // Assuming you have a hargaTiket field
    }

    public Perjalanan getPerjalanan() {
        return perjalanan;
    }

    public void setPerjalanan(Perjalanan perjalanan) {
        this.perjalanan = perjalanan;
    }

    public boolean isStatusPembatalan() {
        return statusPembatalan;
    }
    public void setStatusPembatalan(boolean statusPembatalan) {
        this.statusPembatalan = statusPembatalan;
    }


}