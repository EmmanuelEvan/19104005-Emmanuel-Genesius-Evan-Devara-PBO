package com.evan.Praktikum.Praktikum4.Praktikum.Abstract;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] binatangs = {
                new Burung("Beo"),
                new Kucing("Persia"),
                new Anjing("Husky")
        };
        Binatang kesayangan;
        Random random = new Random();
        kesayangan = binatangs[random.nextInt(binatangs.length)];
        System.out.println("Binatang Kesayangan\t: " + kesayangan);
        System.out.println("Suaranya\t ");
        kesayangan.suara();
    }
}
