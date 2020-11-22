package com.evan.Praktikum.Praktikum3.Tugas.No2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    private String id, nama;
    private List<Planet> planetList = new ArrayList<>();

    // Constructor
    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // getter dan setter
    public int getTotalMember() {
        return getPlanets().size();
    }

    public List<Planet> getPlanets() {
        return planetList;

    }

    public void setPlanetList(List<Planet> planetList) {

        this.planetList = planetList;
    }

    public String getId() {

        return id;
    }

    public String getNama() {

        return nama;
    }

    // Method getData
    public void getData() {
        System.out.println("ID Solar System\t\t: " + getId());
        System.out.println("Nama Solar System\t: " + getNama());
        System.out.println("Total Member\t\t: " + getTotalMember());
        System.out.println();
        for (Planet planet : planetList) {
            System.out.println("- ID Planet\t: " + planet.getIdPlanet() + " \t- Urutan Planet\t: " + planet.getUrutanPlanet() + " \t- Nama Planet\t: " + planet.getNamaPlanet());
        }
    }
}


