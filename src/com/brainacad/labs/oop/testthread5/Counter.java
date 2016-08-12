package com.brainacad.labs.oop.testthread5;

public class Counter extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < Storage.COUNT_BOUND; i++) {
            synchronized (this) {
                Storage.store(Storage.read() + 1);


                try {
                    wait();
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
