package com.brainacad.labs.oop.testthread2;

import java.util.Random;

public class Main {
    final static int ARRAY_SIZE = 1000;
    public static void main(String[] args) {
        int[] myArray = new int[ARRAY_SIZE];

        Random randomizer = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            myArray[i] = randomizer.nextInt(ARRAY_SIZE);
        }

        MySumCount counter1 = new MySumCount("Thread1", 10, 500, myArray);
        MySumCount counter2 = new MySumCount("Thread2", 501, 901, myArray);

        Thread counter1Thread = new Thread(counter1);
        Thread counter2Thread = new Thread(counter2);

        counter1Thread.start();
        counter2Thread.start();

        try {
            counter1Thread.join();
            counter2Thread.join();
        }
        catch (InterruptedException e) {
            System.err.println("Counters interrupted");
            e.printStackTrace();
        }

        System.out.println(counter1.getResultSum());
        System.out.println(counter2.getResultSum());
    }
}
