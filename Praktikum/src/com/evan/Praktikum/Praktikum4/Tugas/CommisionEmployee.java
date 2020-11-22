package com.evan.Praktikum.Praktikum4.Tugas;

public class CommisionEmployee extends Employee {
    // Constructor
    public CommisionEmployee(String nama, String nip, long upah, long komisi, int totalPenjualan) {

        super(nama, nip, upah, komisi, totalPenjualan, (int) 0);
    }

    @Override
    public void getGaji() {
        long gaji = upah + (komisi * totalPenjualan);
        System.out.println("Total gaji " + nama + " sebagai Commision Employee" + " adalah " + "Rp. " + gaji);
    }
}
