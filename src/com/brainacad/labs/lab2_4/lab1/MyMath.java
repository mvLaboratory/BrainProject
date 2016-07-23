package com.brainacad.labs.lab2_4.lab1;

public class MyMath {
    public final static double PI = 3.14;
    public static int findMin(int[] arr) throws IllegalArgumentException {
        if (arr.length == 0)
            throw new IllegalArgumentException("Empty array");

        int min = arr[0];
        for (int ell : arr) {
            if (ell < min) {
                min = ell;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) throws IllegalArgumentException {
        if (arr.length == 0)
            throw new IllegalArgumentException("Empty array");

        int max = arr[0];
        for (int ell : arr) {
            if (ell > max) {
                max = ell;
            }
        }
        return max;
    }

    public static double areaOfCircle(double r) {
        return PI * r *r;
    }
}
