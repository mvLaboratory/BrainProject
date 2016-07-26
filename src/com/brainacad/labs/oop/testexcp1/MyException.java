package com.brainacad.labs.oop.testexcp1;

public class MyException extends Exception {
    private String desc;

    public MyException(String desc) {
        this.desc = desc;
    }

    public void printMessage() {
        System.out.println(desc);
    }
}
