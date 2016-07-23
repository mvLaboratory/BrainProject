package com.brainacad.tests.test27;

/**
 * Created by mv on 19.07.2016.
 */
class A {
    void doIt() {
        System.out.println("A");
    }
}

public class B extends A {
    void doIt() {
        System.out.println("B");

    }

    public static void main(String[] args) {
        B b = new B();
        b.go();
    }

    void go() {
        super.doIt();
    }
}
