package com.brainacad.labs.lab1_5.lab3;


public class Lab3 {
    public static void main(String[] args) {
        System.out.println("* | 1  2  3  4  5  6  7  8  9");
        System.out.println("-------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.print(i + " |");
            for (int j = 1; j < 10; j++) {
                String out = "  " + (i * j) + " ";
                System.out.print(out.substring(out.length() - 3));
            }
            System.out.println();
        }
        
    }
}
