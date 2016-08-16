package com.brainacad.labs.oop.testthread5;

import java.util.concurrent.atomic.AtomicInteger;

public class Storage {
    private boolean isReadyToPrint = false;
    public static final int COUNT_BOUND = 1_000_000;

    public Storage() {
        this.value = new AtomicInteger(0);
    }

    private AtomicInteger value;

    public int read() {
        isReadyToPrint = false;
        return value.intValue();
    }

    public void increment() {
        this.value.getAndIncrement();
        isReadyToPrint = true;
    }

    public boolean isFull() {
        return value.intValue() >= COUNT_BOUND;
    }

    public boolean isReady() {
        return isReadyToPrint;
    }

}
