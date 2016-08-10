package com.brainacad.labs.oop.testthread1;

public class MyTimeBomb extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                return;
            }
        }

        System.out.println("Boom!!!");
    }
}
