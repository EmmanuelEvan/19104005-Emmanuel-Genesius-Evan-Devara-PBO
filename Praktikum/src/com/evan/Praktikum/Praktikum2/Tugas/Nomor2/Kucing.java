package com.evan.Praktikum.Praktikum2.Tugas.Nomor2;

public class Kucing extends Binatang {
    public String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    //Method GetName
    public void getNama() {
        System.out.println("Nama Kucing\t : " + nama);
    }

    // Method mencetak aktivita
    public void meong() {
        System.out.println("Suara " + nama + " Meong");
    }
}

