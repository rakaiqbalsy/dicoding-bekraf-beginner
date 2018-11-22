package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Common;

public class SMK {
    private String nama, alamat, logo, npsn, akreditas, letak, tahun;

    //constructor
    public SMK() { }

    public SMK(String nama, String alamat, String logo, String npsn, String akreditas, String letak, String tahun) {
        this.nama = nama;
        this.alamat = alamat;
        this.logo = logo;
        this.npsn = npsn;
        this.akreditas = akreditas;
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

    public String getLogo() {
        return logo;
    }

    public String getNpsn() {
        return npsn;
    }

    public String getAkreditas() {
        return akreditas;
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

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setNpsn(String npsn) {
        this.npsn = npsn;
    }

    public void setAkreditas(String akreditas) {
        this.akreditas = akreditas;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
}
