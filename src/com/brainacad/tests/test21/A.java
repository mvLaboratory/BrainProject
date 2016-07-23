
package com.brainacad.tests.test21;

public class A {
    public static void main(String[] args) {

        A a = new A();

        a.met(10, 1);



    }

//    public int daysOffWork(int year, String... months, int... days) {
//
//        int daysOff = 0;
//
//        for (int i = 0; i < days.length; i++)
//
//            daysOff += days[i];
//
//        return daysOff;
//
//    }


    void met(final int a, int b) {

        b *= a;

        System.out.println(a);

    }
}