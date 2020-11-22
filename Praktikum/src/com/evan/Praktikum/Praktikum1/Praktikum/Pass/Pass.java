package com.evan.Praktikum.Praktikum1.Praktikum.Pass;

public class Pass {
    public static void main(String[] args) {
        int nomor1, nomor2;

        TestPass passed = new TestPass(50, 100);
        nomor1 = 10;
        nomor2 = 20;

        //Passed by Value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomor 1\t: " + nomor1);
        System.out.println("Nomor 2\t: " + nomor2);

        passed.calculate(nomor1, nomor2);
        System.out.println("Nilai setelah passed by value\t: ");
        System.out.println("Nomor 1\t: " + nomor1);
        System.out.println("Nomor 2\t: " + nomor2);
        System.out.println();

        //passed by referance
        System.out.println("Nilai setelah passed by reference\t: ");
        System.out.println("Passed.Nomor 1\t: " + passed.nomor1);
        System.out.println("Passed.Nomor 2\t: " + passed.nomor2);
        System.out.println();

        passed.calculate(passed);
        System.out.println("Nilai sesudah passed by reference\t: ");
        System.out.println("Passed.Nomor 1\t: " + passed.nomor1);
        System.out.println("Passed.Nomor 2\t: " + passed.nomor2);
    }


}
