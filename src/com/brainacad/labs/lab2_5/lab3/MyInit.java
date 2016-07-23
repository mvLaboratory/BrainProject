package com.brainacad.labs.lab2_5.lab3;

import java.util.Arrays;
import java.util.Random;

public class MyInit {
    private final static int ARR_SIZE = 10;
    private static int[] arr = new int[ARR_SIZE];
    Random randomizer = new Random();

    {
        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = randomizer.nextInt(500);
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }
}
