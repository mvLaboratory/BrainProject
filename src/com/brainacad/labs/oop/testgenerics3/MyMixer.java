package com.brainacad.labs.oop.testgenerics3;

public class MyMixer <T> {
    T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public T[] shuffle(T[] arr) {
        return arr;
    }
}
