package com.evan.Praktikum.Praktikum5.Tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IdPengunjung {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println(" <---Pelanggan---> ");
        System.out.print("Jumlah Pengunjung\t\t: ");
        int jmlPengunjung = scan.nextInt();
        System.out.println("Masukkan Data Pengunjung\t: ");
        for (int i = 0; i < jmlPengunjung; i++) {
            try {
                System.out.print("UID\t: ");
                array[i] = intInputMethod();
                System.out.println("Data ke-" + i + " : " + array[i] + " terdaftar");

                //Exception
            } catch (InputMismatchException e) {
                System.out.println("Inputkan Angka !!!");
                i--;
                //Exception array
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Maksimal Jumlah Pengunjung 10");
            }
        }
        System.out.println();
        System.out.println("Lihat Data Pengunjung\t: ");
        // Input indeks untuk mencari UID pengunjung
        System.out.print("Indeks\t: ");
        int lihatData = scan.nextInt();
        System.out.println("Data ke-" + lihatData + " : " + array[lihatData]);

        // looping
        boolean cek = false;
        do {
            //output
            System.out.print("Lihat Lagi? (y/n)\t: ");
            String lihat = scan.next();

            if (lihat.equals("y") || lihat.equals("Y")) {
                System.out.println("Lihat Data Pengunjung\t: ");
                System.out.print("Indeks\t: ");
                lihatData = scan.nextInt();
                System.out.println("Data ke-" + lihatData + " : " + array[lihatData]);

            } else {
                cek = true;
            }
        } while (!cek);

    }

    // Method
    public static int intInputMethod() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

}
