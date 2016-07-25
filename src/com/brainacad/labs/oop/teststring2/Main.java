package com.brainacad.labs.oop.teststring2;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon", myStr2 = "Tomcat";

        char[] srt1Chars = myStr1.toCharArray();

        for (char symbol : srt1Chars) {
            if (myStr2.indexOf(symbol) < 0) {
                System.out.print(symbol);
            }
        }
    }
}
