package com.evan.Praktikum.Praktikum2.Tugas.Nomor2;

public class Ikan extends Binatang {
    public String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    //Method Getname
    public void getNama() {
        System.out.println("Nama Ikan\t : " + nama);
    }

    // Method mencetak aktivita
    public void berenang() {
        System.out.println(nama + " dapat Berenang");
    }
}

