package com.evan.Praktikum.Praktikum2.Praktikum.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Masukkan Data ke SuperClass");
        superclass.x = 10;
        superclass.y = 50;
        superclass.PrintXY();

        subclass.x = 30;
        subclass.y = 40;
        subclass.z = 10;
        subclass.PrintXY();
        subclass.sumValue();

    }
}
