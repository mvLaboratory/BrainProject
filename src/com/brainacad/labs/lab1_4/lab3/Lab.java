package com.brainacad.labs.lab1_4.lab3;

/**
 * Created by mv on 02.07.2016.
 */
public class Lab {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 && b2);
        System.out.println(b1 && b1);
        System.out.println(b2 && b2);

        System.out.println(b1 || b2);
        System.out.println(b1 || b1);
        System.out.println(b2 || b2);

        System.out.println(b1 ^ b2);
        System.out.println(b1 ^ b1);
        System.out.println(b2 ^ b2);

        System.out.println(!b1);
        System.out.println(!b2);
    }
}
