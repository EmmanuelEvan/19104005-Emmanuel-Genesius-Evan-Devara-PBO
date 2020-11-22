package com.evan.Praktikum.Praktikum3.Praktikum.Komposisi;

public class Keyboard {
    private String merek, type;

    public Keyboard(String merek, String type) {
        this.merek = merek;
        this.type = type;
    }

    public void PrintSpec() {
        System.out.println("- Merek\t: " + merek);
        System.out.println("- Type\t: " + type);
        System.out.println();
    }
}
