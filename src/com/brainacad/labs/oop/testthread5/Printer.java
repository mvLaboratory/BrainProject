package com.brainacad.labs.oop.testthread5;

public class Printer extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Storage.COUNT_BOUND; i++) {
            System.out.println(Storage.read());

            synchronized (this) {
                notifyAll();
            }
        }
    }
}
