package com.evan.Praktikum.Praktikum1.Praktikum.Pass;

//class constructor
public class TestPass {
    int nomor1, nomor2;

    public TestPass(int nomor1, int momor2) {
        this.nomor1 = nomor1;
        this.nomor2 = momor2;
    }

    //Passed by Value
    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    //Passed by reference
    void calculate(TestPass passed) {
        passed.nomor1 = passed.nomor1 * 10;
        passed.nomor2 = passed.nomor2 / 2;
    }
}
