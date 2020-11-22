package com.evan.Praktikum.Praktikum4.Praktikum.Interface;

public interface DemoInterface {
    public static void main(String[] args) {
        Paket paket = new Paket("PBO", "Bagus", 90000, "800 mb", 80000);
        paket.hitungHargaPaket();
        paket.cetakPaket();
    }
}
