package com.brainacad.lessons.lesson6;

/**
 * Created by mv on 11.07.2016.
 */
public class Lesson {
    public static void main(String[] args) {
        String multiStrArr[][] = new String[][]{
                {"A", "B"},
                null,
                {"Jan", "Feb", null},
        };

        System.out.println(multiStrArr[1][1]);
    }

}
