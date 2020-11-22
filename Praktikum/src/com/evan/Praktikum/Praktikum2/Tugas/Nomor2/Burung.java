package com.evan.Praktikum.Praktikum2.Tugas.Nomor2;

public class Burung extends Binatang {
    public String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    //method getname
    public void getNama() {
        System.out.println("Nama Burung\t : " + nama);
    }

    // Method mencetak aktivita
    public void terbang() {
        System.out.println(nama + "Terbang");
    }
}

