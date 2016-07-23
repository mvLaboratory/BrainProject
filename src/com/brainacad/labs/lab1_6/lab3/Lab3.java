package com.brainacad.labs.lab1_6.lab3;

import java.util.Arrays;

public class Lab3 {
    public static void main(String[] args) {
        int[][] square = new int[4][4];
        int counter = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                square[j][i] = counter;
                counter++;
            }
        }

        for (int[] line : square) {
            System.out.println(Arrays.toString(line));
        }
    }
}
