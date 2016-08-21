package com.brainacad.labs.oop.testthread5;

public class Counter extends Thread{
    private Storage storage;

    public Counter(String counterName, Storage storage) {
        super(counterName);
        this.storage = storage;
    }

    @Override
    public void run() {
        while (!storage.isFull()) {
            synchronized (storage) {
                storage.increment();
                try {
                    storage.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(Thread.currentThread().getName() + " #" + Thread.currentThread().getId() + " finished");
    }
}
