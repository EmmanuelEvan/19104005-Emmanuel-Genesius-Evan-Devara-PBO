package com.evan.Praktikum.Praktikum3.Praktikum.Komposisi;

public class Cpu {
    private String processor, gpu, ram;

    public Cpu(String processor, String gpu, String ram) {
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }

    public void PrintSpec() {
        System.out.println("- Processor\t: " + processor);
        System.out.println("- GPU\t\t: " + gpu);
        System.out.println("- RAM\t\t: " + ram + " Gb");
        System.out.println();
    }
}
