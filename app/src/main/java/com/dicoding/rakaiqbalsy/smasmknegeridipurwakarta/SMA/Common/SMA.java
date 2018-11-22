package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Common;

public class SMA {
    private String nama, alamat, foto, npsn, akreditasi, letak, tahun;


    // constuctor
    public SMA() {
    }

    public SMA(String nama, String alamat, String foto, String npsn, String akreditasi, String letak, String tahun) {
        this.nama = nama;
        this.alamat = alamat;
        this.foto = foto;
        this.npsn = npsn;
        this.akreditasi = akreditasi;
        this.letak = letak;
        this.tahun = tahun;
    }

    //getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getFoto() {
        return foto;
    }

    public String getNpsn() {
        return npsn;
    }

    public String getAkreditasi() {
        return akreditasi;
    }

    public String getLetak() {
        return letak;
    }

    public String getTahun() {
        return tahun;
    }

    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setNpsn(String npsn) {
        this.npsn = npsn;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
}
