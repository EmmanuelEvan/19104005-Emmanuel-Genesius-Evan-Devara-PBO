package com.evan.Praktikum.Praktikum3.Tugas.No3;

import java.util.ArrayList;

public class DemoKomposisi {
    public static void main(String[] args) {

        Keluarga keluarga = new Keluarga("cemara", "Bali");
        ArrayList<Anak> anakList = new ArrayList<>();

        keluarga.addAnggotaKeluarga(new Ayah(1, "Yanto", 53),
                new Ibu(2, "Yora", 46),
                anakList);

        anakList.add(new Anak(3, "Beni", 20, "Anak Adopsi"));
        ;

        keluarga.getDataKeluarga();
    }
}

