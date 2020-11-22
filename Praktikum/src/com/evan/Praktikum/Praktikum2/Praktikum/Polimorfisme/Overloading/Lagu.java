package com.evan.Praktikum.Praktikum2.Praktikum.Polimorfisme.Overloading;

public class Lagu {
    //variabel
    public String pencipta, judul;

    //Method
    // Overloading
    public Lagu(String judul) {
        this.judul = judul;
    }

    //Overloading
    public Lagu(String pencipta, String judul) {
        this.pencipta = pencipta;
        this.judul = judul;
    }

    //Print
    public void getDataLagu() {
        System.out.println("Judul\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
    }
}
