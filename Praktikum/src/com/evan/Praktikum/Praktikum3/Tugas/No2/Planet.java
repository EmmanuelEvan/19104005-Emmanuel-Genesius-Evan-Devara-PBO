package com.evan.Praktikum.Praktikum3.Tugas.No2;

public class Planet {

    private int idPlanet, urutanPlanet;
    private String namaPlanet;

    // Constructor
    public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.urutanPlanet = urutanPlanet;
        this.namaPlanet = namaPlanet;
    }

    // Method getter
    public int getIdPlanet() {
        return idPlanet;
    }

    // setter
    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public int getUrutanPlanet() {
        return urutanPlanet;
    }

    public void setUrutanPlanet(int urutanPlanet) {
        this.urutanPlanet = urutanPlanet;
    }

    public String getNamaPlanet() {
        return namaPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        this.namaPlanet = namaPlanet;
    }
}

