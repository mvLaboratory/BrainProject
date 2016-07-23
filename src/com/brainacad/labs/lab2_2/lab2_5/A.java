package com.brainacad.labs.lab2_2.lab2_5;

public class A {
    private static int aPOW(final int val) {
        return val * val;
    }

    //square
    public static int calcSquare(int side) {
        return aPOW(side);
    }

    //foursquare
    public static int calcSquare(int sideA, int sideB) {
        return sideA * sideB;
    }

    //circle
    public static double calcSquare(int radius, double Pi) {
        return aPOW(radius) * Pi;
    }
}
