package com.evan.Praktikum.Praktikum1.Tugas.Konversi;

public class Konversi {

    // Deklarasi
    double CF, FK, KR, RC;

    //Method
    public float CF(float suhu) {
        float hasil = (suhu * 9 / 5) + 32;
        return hasil;
    }

    public float FK(float suhu) {
        float hasil = (suhu - 32) * 5 / 9 + 273;
        return hasil;
    }

    public float KR(float suhu) {
        float hasil = (suhu - 273) * 4 / 5;
        return hasil;
    }

    public float RC(float suhu) {
        float hasil = suhu * 5 / 4;
        return hasil;


    }
}

