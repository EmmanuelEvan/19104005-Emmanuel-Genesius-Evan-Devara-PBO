package com.evan.Praktikum.Praktikum3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("2110", "RPL");
        Mahasiswa mahasiswa1 = new Mahasiswa("Paimon", 21104001);
        Mahasiswa mahasiswa2 = new Mahasiswa("Paiman", 21104002);
        Mahasiswa mahasiswa3 = new Mahasiswa("Paimin", 21104003);

        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(new Mahasiswa("Fishy", 21104004));

        //untuk copas data dari list mahasiswa class"demojurusan"ke class"jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        //untuk masukkan data Mahasiswa langsung ke class jurusan
        jurusan.addMahasiswa(mahasiswa3);

        jurusan.printDataJurusan();
    }

}
