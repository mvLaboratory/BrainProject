package com.brainacad.labs.oop.overloadresolution1;

public class Main {
    public static void main(String[] args) {
        int b = 1;
        foo(b, 15);
       // foo(new Object());
        foo(new Animal());
        foo(new Dog());
        foo(null);
    }

//    static void foo(Byte b) {
//        System.out.println("Byte");
//    }

    static void foo(short s) {
        System.out.println("short");
    }

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(int i, int i2) {
        System.out.println("int, int");
    }

//    static void foo(int... i) {
//        System.out.println("int...");
//    }


    static void foo(long i) {
        System.out.println("long");
    }

    static void foo(float i) {
        System.out.println("float");
    }

    static void foo(double i) {
        System.out.println("double");
    }

    static void foo(Animal a) {
        System.out.println("Animal");
    }

    static void  foo(Dog d) {
        System.out.println("Dog");
    }

    static void  foo(Puppy p) {
        System.out.println("Puppy");
    }
}
