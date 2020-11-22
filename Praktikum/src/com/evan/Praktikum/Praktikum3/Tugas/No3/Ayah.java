package com.evan.Praktikum.Praktikum3.Tugas.No3;

public class Ayah {

    private int idAyah, umurAyah;
    private String namaAyah;


    // Constractor
    public Ayah(int idAyah, String namaAyah, int umurAyah) {
        this.idAyah = idAyah;
        this.namaAyah = namaAyah;
        this.umurAyah = umurAyah;
    }

    //getter
    public int getIdAyah() {
        return idAyah;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public int getUmurAyah() {
        return umurAyah;
    }

}


