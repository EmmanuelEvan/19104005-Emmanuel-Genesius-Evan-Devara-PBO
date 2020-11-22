package com.evan.Praktikum.Praktikum2.Praktikum.Polimorfisme.VMI;

public class DemoVmi {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parentChild = new Child();

        child.getData();
        parentChild.getData();
    }
}
