package com.evan.Praktikum.Praktikum3.Praktikum.Komposisi;

public class DemoComputer {
    //deklarasi
    public static void main(String[] args) {
        Computer computer = new Computer("Gaming");

        Keyboard keyboard = new Keyboard("Sades", "Mechanical");
        Mouse mouse = new Mouse("Razer", "800");
        Monitor monitor = new Monitor("Armagedon", "24", "144");
        Cpu cpu = new Cpu("Intel I7", "Nvidia 3070", "16");

        computer.addComponent(keyboard, mouse, monitor, cpu);
        System.out.println("Type Computer\t: " + computer.getType());
        System.out.println();

        System.out.println("Kecboard\t: ");
        computer.getKeyboard().PrintSpec();

        System.out.println("Mouse\t: ");
        computer.getMouse().PrintSpec();

        System.out.println("Monitor\t: ");
        computer.getMonitor().PrintSpec();

        System.out.println("Cpu\t: ");
        computer.getCpu().PrintSpec();
    }

}
