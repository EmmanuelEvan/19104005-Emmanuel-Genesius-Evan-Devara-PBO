package com.evan.Praktikum.Praktikum3.Tugas.No1;

public class DemoAsosiasi {
    public static void main(String[] args) {

        Komplek komplek = new Komplek("Perum Kencana", "mawar");

        Rumah rumah1 = new Rumah("M1", "Erpan", 1);
        Rumah rumah2 = new Rumah("M2", "Budi", 3);


        komplek.addRumah(rumah1.getIdRumah());
        rumah1.getDataRumah();
        komplek.addRumah(rumah2.getIdRumah());
        rumah2.getDataRumah();


        komplek.getDataKompek();

    }
}

