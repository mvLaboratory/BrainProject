package com.brainacad.labs.oop.testconcoll1;

public class Mapper extends Thread {

    MyConcurentMap map;

    public Mapper(MyConcurentMap map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            map.put(i, "some_" + i);
        }
    }
}
