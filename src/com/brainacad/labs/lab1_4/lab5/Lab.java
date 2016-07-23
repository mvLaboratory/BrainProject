package com.brainacad.labs.lab1_4.lab5;

/**
 * Created by mv on 02.07.2016.
 */
public class Lab {
    public static void main(String[] args) {
        int a1 = -20;
        int a2 = -20;

        System.out.println(a1);
        System.out.println(a2);

        System.out.println();

        System.out.println(a1 >> 2);
        System.out.println(a2 / 4);

        System.out.println();

        System.out.println(a1 << 2);
        System.out.println(a2 * 4);

        System.out.println();

        int a3 = -490;
        int a4 = -490;
        a4 = a4 >> 3;
        int a5 = a3 >>> 3;
        System.out.println(Integer.toBinaryString(a3));
        System.out.println(Integer.toBinaryString(a4));
        System.out.println(Integer.toBinaryString(a5));
    }
}
