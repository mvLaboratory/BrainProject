package com.brainacad.tests.test29;

public class MyOuter {
    private String x = "Outer";

    public class Inner2 {

    }

    void doStuff() {

        class MyInner {
            public MyInner() {
                MyInner mi = new MyInner();
                mi.seeOuter();
            }



            public void seeOuter() {
                System.out.println("Outer x is " + x);
            }
        }
    }

    public static void main(String[] args) {
        MyOuter myOuter = new MyOuter();
        myOuter.doStuff();
    }
}
