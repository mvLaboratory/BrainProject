package com.brainacad.labs.lab1_4.lab6;

/**
 * Created by mv on 04.07.2016.
 */
public class Lab {
    public static void main(String[] args) {
        int a = 123;
        int b = 456;

        System.out.println("" + a + " - " + Integer.toBinaryString(a));
        System.out.println("" + b + " - " + Integer.toBinaryString(b));

        System.out.println("& - " + (a & b) + " - " + Integer.toBinaryString(a & b ));
        System.out.println("| - " + (a | b) + " - " + Integer.toBinaryString(a | b ));
        System.out.println("^ - " + (a ^ b) + " - " + Integer.toBinaryString(a ^ b ));
        System.out.println("~ - " + (~a) + " - " + Integer.toBinaryString(~a));
    }
}
