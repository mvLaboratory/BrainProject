package com.brainacad.labs.lab1_4.lab2;

/**
 * Created by mv on 02.07.2016.
 */
public class Lab {
    public static void main(String[] args) {
        byte b = 5;
        short s = (short)(130 + b);
        int i = s * b;
        long l = i * s;
        float f = l / b;
        double d = f * l;

        System.out.println(d);
        System.out.println(d % b);
    }
}
