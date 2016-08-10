package com.brainacad.tests.test211;

class Pair<T> {
    T object1;
    T object2;
    Pair(T one, T two) {
        object1 = one;
        object2 = two;
    }
    public T getFirst() {
        return object1;
    }
    public T getSecond() {
        return object2;
    }
}
public class PairTest {
    public static void main(String[] args) {

    }
}