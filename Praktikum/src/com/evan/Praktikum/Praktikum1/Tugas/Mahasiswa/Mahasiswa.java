package com.evan.Praktikum.Praktikum1.Tugas.Mahasiswa;

public class Mahasiswa {
    String nama, umur, alamat, agama, jurusan;


    // Constractor
    public Mahasiswa(String nama, String umur, String alamat, String agama, String kelamin, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.agama = agama;
        this.jurusan = jurusan;
    }

    public Mahasiswa() {

    }
    //getter and setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}

