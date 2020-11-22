package com.evan.Praktikum.Praktikum4.Praktikum.Abstract;

public abstract class Binatang {
    private String jenis;

    public Binatang(String jenis) {
        this.jenis = jenis;
    }

    //method abstract
    protected abstract void suara();

    @Override
    public String toString() {
        return "Seekor" + jenis;
    }
}
