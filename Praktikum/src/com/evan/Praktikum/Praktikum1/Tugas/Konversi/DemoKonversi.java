package com.evan.Praktikum.Praktikum1.Tugas.Konversi;

import java.util.Scanner;

public class DemoKonversi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Konversi konversi = new Konversi();

        // Input Suhu
        System.out.print("Masukan Suhu Dalam Celcius\t: ");
        float suhu = scan.nextFloat();

        // konversi suhu dari Celcius Ke Fahrenheit
        Float suhu1 = konversi.CF(suhu);
        System.out.println("Celcius Ke Fahrenheit\t: " + suhu1);

        //  konversi suhu dari Fahrenheit Ke Kelvin
        Float suhu2 = konversi.FK(suhu1);
        System.out.println("Fahrenheit Ke Kelvin\t: " + suhu2);

        //  konversi suhu dari Kelvin Ke Reamur
        Float suhu3 = konversi.KR(suhu2);
        System.out.println("Kelvin Ke Reamur\t: " + suhu3);

        // konversi suhu dari Reamur Ke Celcius
        Float suhu4 = konversi.RC(suhu3);
        System.out.println("Reamur Ke Celcius\t: " + suhu4);

    }

}
