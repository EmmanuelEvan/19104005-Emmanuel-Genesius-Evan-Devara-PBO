package com.evan.Praktikum.Praktikum2.Praktikum.Polimorfisme.OverRiding;

public class DemoOverRiding {
    public static void main(String[] args) {
        X supperClass = new X();
        Y subClass = new Y();

        supperClass.getValue("Mati listirk");
        subClass.getValue("Mati lampu");
    }
}
