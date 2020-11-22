package com.evan.Praktikum.Praktikum4.Tugas;

public class ProjectPlanner extends Employee {
    // Constructor
    public ProjectPlanner(String nama, String nip, long upah, long komisi, int totalProjek) {

        super(nama, nip, upah, komisi, (int) 0, totalProjek);
    }

    @Override
    public void getGaji() {
        long pajak = (upah * 5) / 100;
        long gaji = upah + (komisi * totalProjek) - pajak;
        System.out.println("Total gaji " + nama + " sebagai Project Planner" + " adalah " + "Rp. " + gaji);
    }
}
