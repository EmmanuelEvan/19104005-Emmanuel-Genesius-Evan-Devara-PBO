package com.evan.Praktikum.Praktikum4.Praktikum.Abstract;

public class Anjing extends Binatang {
    private String nama;

    public Anjing(String nama) {
        super("Anjing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("Menggonggong");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
