package com.brainacad.labs.lab1_6.lab2;

import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args) {
        int[] m = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        int min = m[0];
        int max = m[0];
        int sum = 0;

        Arrays.sort(m);
        System.out.println(Arrays.toString(m));

        for (int element : m) {
            if (element < min)
                min = element;

            if (element > max)
                max = element;

            sum += element;
        }

        int mSize = m.length;
        int median;
        if (mSize % 2 == 0) {
            median = m[mSize / 2];
        }
        else {
            int medianHlf = mSize / 2;
            median = (m[medianHlf - 1] + m[medianHlf]) / 2;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("sum: " + sum);
        System.out.println("avg: " + sum / 12f);
        System.out.println("median: " + median);
    }
}
