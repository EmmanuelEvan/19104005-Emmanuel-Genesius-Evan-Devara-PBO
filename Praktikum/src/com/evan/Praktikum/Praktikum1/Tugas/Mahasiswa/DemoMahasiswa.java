package com.evan.Praktikum.Praktikum1.Tugas.Mahasiswa;

import java.util.Scanner;

public class DemoMahasiswa {
    public static void main(String[] args) {
        //deklarasi
        String nama;
        String umur;
        String alamat;
        String agama;
        String jurusan;

        //constructor
        Mahasiswa daftar = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);


        // Input
        System.out.println("Masukan Nama : ");
        nama = scanner.nextLine();
        daftar.setNama(nama);
        System.out.println("Masukan Umur : ");
        umur = scanner.nextLine();
        daftar.setUmur(umur);
        System.out.println("Masukan Alamat : ");
        alamat = scanner.nextLine();
        daftar.setAlamat(alamat);
        System.out.println("Masukan Agama : ");
        agama = scanner.nextLine();
        daftar.setAgama(agama);
        System.out.println("Masukan Pilihan jurusan : ");
        jurusan = scanner.nextLine();
        daftar.setJurusan(jurusan);

        // Output
        System.out.println("=====DATA ANDA=====");
        System.out.println("Nama : " + daftar.getNama());
        System.out.println("Umur : " + daftar.getUmur());
        System.out.println("Alamat : " + daftar.getAlamat());
        System.out.println("Agama : " + daftar.getAgama());
        System.out.println("Jurusan : " + daftar.getJurusan());
    }
}

