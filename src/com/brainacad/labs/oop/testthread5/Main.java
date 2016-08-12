package com.brainacad.labs.oop.testthread5;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Printer printer = new Printer();

        counter.start();
        printer.start();

    }
}
