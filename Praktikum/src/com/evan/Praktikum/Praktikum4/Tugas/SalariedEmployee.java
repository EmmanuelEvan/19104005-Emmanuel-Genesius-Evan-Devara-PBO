package com.evan.Praktikum.Praktikum4.Tugas;

public class SalariedEmployee extends Employee {
    // Constructor
    public SalariedEmployee(String nama, String nip, long upah) {
        super(nama, nip, upah);

        this.nama = nama;
        this.nip = nip;
        this.upah = upah;
    }

    @Override
    public void getGaji() {
        System.out.println("Total gaji " + nama + " sebagai Salaried Employee" + " adalah " + "Rp. " + upah);
    }
}
