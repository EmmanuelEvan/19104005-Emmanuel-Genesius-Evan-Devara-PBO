package com.evan.Praktikum.Praktikum2.Praktikum.Polimorfisme.Overloading;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Semongko");
        Lagu lagu2 = new Lagu("Feby", " Halu");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
