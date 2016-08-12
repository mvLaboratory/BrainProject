package com.brainacad.labs.oop.testthread5;

public class Storage {
    public final static int COUNT_BOUND = 1_000;
    private static int value;

    public static int read() {
        return value;
    }

    public static void store(int value) {
        Storage.value = value;
    }
}
