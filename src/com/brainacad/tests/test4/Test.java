package com.brainacad.tests.test4;

/**
 * Created by mv on 04.07.2016.
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;

        a = a++ + a + a-- - a-- + ++a;
        System.out.println(a);

        a = 2;
        int b = 3;


        int c = ((a + b++ - --a) * (++b - a--)) + a + b - a-- + ++a;
        System.out.println(c);

        int q = 010;
        System.out.println(q);

        System.out.printf("this is variables %s and %s", q, b);
    }
}
