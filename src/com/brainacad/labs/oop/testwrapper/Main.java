package com.brainacad.labs.oop.testwrapper;

public class Main {
    public static void main(String[] args) {
        Integer x1 = 130;
        Integer x2 = new Integer(130);
        Integer x3 = Integer.valueOf(130);
        Integer x4 = Integer.parseInt("130");
        int x5 = 130;

        System.out.println("x1 == x2: " + (x1 == x2));
        System.out.println("x1 equals x2: " + x1.equals(x2));

        System.out.println("x1 == x3: " + (x1 == x3));
        System.out.println("x1 equals x3: " + x1.equals(x3));

        System.out.println("x1 == x4: " + (x1 == x4));
        System.out.println("x1 equals x4: " + x1.equals(x4));

        System.out.println("x1 == x5: " + (x1 == x5));
        System.out.println("x1 equals x5: " + x1.equals(x5));
        System.out.println();

        System.out.println("x3 == x4: " + (x3 == x4));
        System.out.println("x3 equals x4: " + x3.equals(x4));

        System.out.println("x3 == x5: " + (x3 == x5));
        System.out.println("x3 equals x5: " + x3.equals(x5));

        System.out.println("x4 == x5: " + (x4 == x5));
        System.out.println("x4 equals x5: " + x4.equals(x5));
        System.out.println();
        System.out.println("x4 == x2: " + (x4 == x2));
        System.out.println("x4 equals x2: " + x4.equals(x2));

        System.out.println("x4 == x2: " + (x4 == x2));
        System.out.println("x4 equals x2: " + x4.equals(x2));
    }
}
