package com.brainacad.labs.lab1_5.lab4;


public class Lab4 {
    public static void main(String[] args) {
        int printCount = 0;
        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                printCount++;
            }

            if (printCount >= 10)
                break;
        }
    }
}
