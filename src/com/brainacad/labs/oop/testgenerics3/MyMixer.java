package com.brainacad.labs.oop.testgenerics3;

import java.util.Random;

public class MyMixer <T> {
    T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public T[] shuffle(T[] arr) {
        Random randomizer = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomizer.nextInt(10));
        }
        return arr;
    }
}
