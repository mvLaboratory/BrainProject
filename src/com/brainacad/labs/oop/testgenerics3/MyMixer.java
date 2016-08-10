package com.brainacad.labs.oop.testgenerics3;

import java.util.Random;

public class MyMixer <T> {
    T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public void shuffle() {
        Random randomizer = new Random();


        for (int i = 0; i < arr.length; i++) {
            int newIndex = randomizer.nextInt(arr.length);
            T tmp = arr[i];
            arr[i] = arr[newIndex];
            arr[newIndex] = tmp;
        }
    }
}
