package com.evan.Praktikum.Praktikum4.Tugas;


public class DemoEmployee {
    public static void main(String[] args) {

        SalariedEmployee salaried = new SalariedEmployee("Bambank Sayonara",
                "19104022",
                3000000);

        // Output
        System.out.println("*** Salaried Employee ***");
        System.out.println("Nama\t: " + salaried.nama);
        System.out.println("NIP\t\t: " + salaried.nip);
        System.out.println("Upah\t: " + "Rp. " + salaried.upah);
        //method getter
        salaried.getGaji();

        System.out.println();

        CommisionEmployee commision = new CommisionEmployee("Asep Gorbacep",
                "19104096",
                3500000,
                1000000,
                100);

        // Output
        System.out.println("*** Commision Employee ***");
        System.out.println("Nama\t\t\t: " + commision.nama);
        System.out.println("NIP\t\t\t\t: " + commision.nip);
        System.out.println("Upah\t\t\t: " + "Rp. " + commision.upah);
        System.out.println("Komisi\t\t\t: " + "Rp. " + commision.komisi);
        System.out.println("Total Penjualan\t: " + commision.totalPenjualan);

        //method getter
        commision.getGaji();

        System.out.println();

        // Inisiasi objek Project Planner dan mengisi nilai masing - masing parameter
        ProjectPlanner planner = new ProjectPlanner("Cecep Setiawan",
                "19104099",
                5000000,
                1000000,
                10);

        //output
        System.out.println("*** Project Planner ***");
        System.out.println("Nama\t\t\t: " + planner.nama);
        System.out.println("NIP\t\t\t\t: " + planner.nip);
        System.out.println("Upah\t\t\t: " + "Rp. " + planner.upah);
        System.out.println("Komisi\t\t\t: " + "Rp. " + planner.komisi);
        System.out.println("Total Projek\t: " + planner.totalProjek);

        // Method getter
        planner.getGaji();
    }
}
