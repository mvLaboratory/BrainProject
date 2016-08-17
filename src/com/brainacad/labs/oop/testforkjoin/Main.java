package com.brainacad.labs.oop.testforkjoin;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static int NUM_OF_THREADS = 10;
    private static int ARRAY_BOUND = 1_000_000;

    public static void main(String[] args) {
        int[] data = new int[ARRAY_BOUND];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.println("Start: " + new Date(System.currentTimeMillis()).toString() + " /:/ " + System.nanoTime());
        //System.out.println(Arrays.toString(data));

        int result = new ForkJoinPool(NUM_OF_THREADS).invoke(new MyRecursiveTask(data));
        System.out.println("Sum is: " + result);
        System.out.println("Finish: " + new Date(System.currentTimeMillis()).toString() + " /:/ " + System.nanoTime());
    }
}
