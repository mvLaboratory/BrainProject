package com.brainacad.labs.oop.testthread5;

public class Printer extends Thread {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (!storage.isFull()) {
            synchronized (storage) {
                if (storage.isReady()) {
                    System.out.println(storage.read());
                    storage.notifyAll();

//                    try {
//                        sleep(1);
//                    }
//                    catch (InterruptedException e) {
//
//                    }
                }

                storage.notifyAll();
            }
        }
    }
}
