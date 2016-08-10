package com.brainacad.lessons.Lesson16;

public class Lesson {
    public static void main(String[] args) {
       // new Lesson().doJob("dddd", "dfdf", "sd");
    }

    public void doJob(String... var) {
        System.out.println("String...");
    }

    public void doJob(String var0, String... var) {
        System.out.println("String...");
    }

    public void doJob(String var, String var2) {
        System.out.println("String, String");
    }

    public void doJob(String var) {
        System.out.println("String");
    }
}
