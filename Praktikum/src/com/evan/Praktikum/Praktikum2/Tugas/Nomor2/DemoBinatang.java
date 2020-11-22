package com.evan.Praktikum.Praktikum2.Tugas.Nomor2;

public class DemoBinatang {
    public static void main(String[] args) {
        Binatang binatang = new Binatang();

        System.out.println("Binatang");
        binatang.makan("Binatang");
        binatang.tidur("Binatang");

        System.out.println("Burung");
        Burung binatang2 = new Burung("Cendrawasih");
        binatang2.getNama();
        binatang2.terbang();
        binatang2.makan(binatang2.nama);
        binatang2.tidur(binatang2.nama);

        System.out.println("Ikan");
        Ikan binatang1 = new Ikan("Paus");
        binatang1.getNama();
        binatang1.berenang();
        binatang1.makan(binatang1.nama);
        binatang1.tidur(binatang1.nama);

        System.out.println("Kucing");
        Kucing binatang3 = new Kucing("Alaska");
        binatang3.getNama();
        binatang3.meong();
        binatang3.makan(binatang3.nama);
        binatang3.tidur(binatang3.nama);
    }
}

