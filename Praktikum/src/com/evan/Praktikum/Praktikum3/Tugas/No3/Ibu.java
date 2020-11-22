package com.evan.Praktikum.Praktikum3.Tugas.No3;

public class Ibu {
    private int idIbu, umurIbu;
    private String namaIbu;


    // Constractor
    public Ibu(int idIbu, String namaIbu, int umurIbu) {
        this.idIbu = idIbu;
        this.namaIbu = namaIbu;
        this.umurIbu = umurIbu;
    }

    // getter
    public int getIdIbu() {
        return idIbu;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public int getUmurIbu() {
        return umurIbu;
    }

}

