package com.brainacad.labs.oop.teststring3;

public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static char[] uniqueChars(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        String returnStr = "";
        String checkedString = "";

        for (char symbol : chars) {
            s = s.substring(1);
            if (s.indexOf(symbol) < 0 && checkedString.indexOf(symbol) < 0) {
                returnStr = returnStr + symbol;
            }
            else {
                checkedString = checkedString + symbol;
            }
        }
        return returnStr.toCharArray();
    }
}
