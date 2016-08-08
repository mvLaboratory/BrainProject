package com.brainacad.labs.oop.testgenerics2;

public class Main {
    public static void main(String[] args) {
        System.out.println(MyTestMethod.<Integer> calcNum(new Integer[] {1, 2, 3, 5}, 3));
        System.out.println(MyTestMethod.<Double> calcNum(new Double[] {50.2, 2.0, 3.0, 3.1, 3.2, 5.1}, 3.0));

        System.out.println("***");

        System.out.println(MyTestMethod.<Integer> calcSum(new Integer[] {1, 2, 3, 5}, 3));
        System.out.println(MyTestMethod.<Double> calcSum(new Double[] {50.2, 2.0, 3.0, 3.1, 3.2, 5.1}, 3.0));
    }
}
