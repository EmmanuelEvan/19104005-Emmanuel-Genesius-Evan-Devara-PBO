package com.evan.Praktikum.Praktikum3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Paimon");
        mahasiswa1.setNim(1234567);

        Mahasiswa mahasiswa2 = new Mahasiswa(12345679, "Odading");

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("ACW");
        dosen.setNimMHS(mahasiswa1.getNim());
        dosen.setNimMHS(mahasiswa2.getNim());

        System.out.println("Kode Dosen\t: " + dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiswa\t: ");
        for (int i = 0; i < dosen.getJmlMahasiswa(); i++) {
            System.out.println("- " + dosen.getNimMHS(i));
        }
    }
}
