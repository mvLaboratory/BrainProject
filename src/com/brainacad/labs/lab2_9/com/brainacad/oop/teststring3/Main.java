package com.brainacad.labs.lab2_9.com.brainacad.oop.teststring3;

public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static char[] uniqueChars(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        String returnStr = "";
        int index = 1;

        for (char symbol : chars) {
            s = s.substring(1);
            if (s.indexOf(symbol) < 0) {
                returnStr = returnStr + symbol;
            }

            index++;
        }
        return returnStr.toCharArray();
    }
}
