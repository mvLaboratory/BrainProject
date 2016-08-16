package com.brainacad.labs.oop.testconcoll1;

public class Main {
    public static void main(String[] args) {
        MyConcurentMap myMap = new MyConcurentMap();

        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
        new Mapper(myMap).start();
    }
}
