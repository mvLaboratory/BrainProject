package com.brainacad.labs.oop.teststokennizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Volodymyr Mykytiuk";

        StringTokenizer tokenizer = new StringTokenizer(myStr, ",. ");
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextElement());
        }
    }
}
