package com.brainacad.labs.lab2_4.lab5;

public class MyCalc {
    public static double calcPi(int n) {
        final int BASE = 4;
        double pi = BASE;
        double divider = 3.0;
        int multiplier = 1;

        for (int i = 0; i < n; i++) {
            multiplier *= -1;
            pi = pi + ((BASE / divider) * multiplier);
            divider += 2;
        }

        return pi;
    }
}
