package com.brainacad.labs.lab2_5.lab5;

import java.util.Random;

public class InitTest {
    private int id;
    private static Random randomizer = new Random();
    private static int nextID = randomizer.nextInt(999);
    static {
        System.out.println("next id: " + nextID);
    }

    public InitTest() {
        this.id = ++nextID;
    }

    public int getId() {
        return id;
    }
}
