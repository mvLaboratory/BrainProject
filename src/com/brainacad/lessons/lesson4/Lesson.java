package com.brainacad.lessons.lesson4;

/**
 * Created by mv on 04.07.2016.
 */
public class Lesson {
    public static void main(String[] args) {
        int a = 3;

        switch (a) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("fuck");
        }

        int i = 1;
        int j = 2;
        if (i < 2 && j < 2 || i == 1) {
            System.out.println(true);
        }
        else
            System.out.println(false);
        System.exit(5);
    }
}
