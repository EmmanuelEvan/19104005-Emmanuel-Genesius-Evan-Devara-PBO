package com.evan.Praktikum.Praktikum4.Tugas;

public abstract class Employee {
    // Deklarasi
    public String nama, nip;
    public long upah, komisi;
    public int totalPenjualan, totalProjek;

    // Constructor
    Employee(String nama, String nip, long upah, long komisi, int totalPenjualan, int totalProjek) {
        this.nama = nama;
        this.nip = nip;
        this.upah = upah;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
        this.totalProjek = totalProjek;
    }

    public Employee(String nama, String nip, long upah) {
    }

    public abstract void getGaji();
}
