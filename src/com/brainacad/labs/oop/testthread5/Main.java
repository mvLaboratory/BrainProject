package com.brainacad.labs.oop.testthread5;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Counter counter = new Counter("Counter1", storage);
        Printer printer = new Printer(storage);


        counter.start();
        printer.start();
    }
}
