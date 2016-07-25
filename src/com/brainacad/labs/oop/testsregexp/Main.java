package com.brainacad.labs.oop.testsregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] words = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};

        for (String word : words) {
            System.out.println(word + " :" + (checkPersonWithRegExp(word) ? "is a Person." : "is not a Person."));
        }
    }

    public static boolean checkPersonWithRegExp(String word) {
        Pattern pat = Pattern.compile("(^[A-Z]{1}[a-z]*$)");
        Matcher matcher = pat.matcher(word);

        return matcher.matches();
    }
}
