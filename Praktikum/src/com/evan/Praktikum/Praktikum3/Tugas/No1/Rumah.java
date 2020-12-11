package com.evan.Praktikum.Praktikum3.Tugas.No1;

public class Rumah {
    // Deklarasi
    private String idRumah, pemilikRumah;
    private int jumlahOrang;

    // Constructor
    public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }

    // getter
    public String getIdRumah() {
        return idRumah;
    }

    public String getPemilikRumah() {
        return pemilikRumah;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }

    public String getDataRumah() {
        System.out.println("ID Rumah\t\t: " + getIdRumah());
        System.out.println("Pemilik Rumah\t: " + getPemilikRumah());
        System.out.println("Jumlah Orang\t: " + getJumlahOrang());
        return null;
    }
}

