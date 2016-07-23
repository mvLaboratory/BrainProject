package com.brainacad.labs.lab2_5.lab1;

public class Lab251 {
    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    public Lab251() {
        this(2);
        System.out.println("constructor 2");
    }

    public Lab251(int i) {
        System.out.println("constructor 1");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        new Lab251();
        System.out.println("main finish");
    }
}
