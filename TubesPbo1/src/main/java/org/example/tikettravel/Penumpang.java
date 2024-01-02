package org.example.tikettravel;

public class Penumpang {

    private String nama;
    private String nomorTelepon;
    private String alamatEmail;
    private String nomorIdentitas;

    public Penumpang(String nama, String nomorTelepon, String alamatEmail, String nomorIdentitas) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.alamatEmail = alamatEmail;
        this.nomorIdentitas = nomorIdentitas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }

    public String getNomorIdentitas() {
        return nomorIdentitas;
    }

    public void setNomorIdentitas(String nomorIdentitas) {
        this.nomorIdentitas = nomorIdentitas;
    }
}