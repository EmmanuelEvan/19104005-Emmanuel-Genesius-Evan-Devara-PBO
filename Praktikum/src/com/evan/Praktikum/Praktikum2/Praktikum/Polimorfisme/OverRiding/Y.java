package com.evan.Praktikum.Praktikum2.Praktikum.Polimorfisme.OverRiding;

public class Y extends X {
    //override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value kelas y: " + value);
    }
}
