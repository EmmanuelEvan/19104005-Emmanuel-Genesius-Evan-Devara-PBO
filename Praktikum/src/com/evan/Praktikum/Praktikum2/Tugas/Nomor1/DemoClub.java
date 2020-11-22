package com.evan.Praktikum.Praktikum2.Tugas.Nomor1;

public class DemoClub {
    public static void main(String[] args) {

        // Objek Club
        Club club1 = new Club();
        Club club2 = new Club("Manchester United");
        Club club3 = new Club("Manchester United", "klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris");
        Club club4 = new Club("Manchester United", 1878, "Santiago Bernabeu");
        Club club5 = new Club("Manchester United", 1878, "Santiago Bernabeu", 13, "klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris");

        // Memanggil Method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}

