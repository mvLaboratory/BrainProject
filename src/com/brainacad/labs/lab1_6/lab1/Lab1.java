package com.brainacad.labs.lab1_6.lab1;


import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        int numIndex = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                numbers[numIndex] = i;
                numIndex++;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
