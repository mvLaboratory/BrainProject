package com.brainacad.labs.lab2_5.lab4;

import java.util.Arrays;
import java.util.Random;

public class MyInit {
    private final static int ARR_SIZE = 10;
    private static int[] arr = new int[ARR_SIZE];
    private static Random randomizer = new Random();

    static {
        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = randomizer.nextInt(500);
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }
}
