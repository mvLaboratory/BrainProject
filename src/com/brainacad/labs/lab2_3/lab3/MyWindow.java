package com.brainacad.labs.lab2_3.lab3;

public class MyWindow {
    double width, height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow() {
        this.width = 40;
        this.height = 50;
        this.numberOfGlass = 2;
        this.color = "White";
        this.isOpen = false;
    }

    public MyWindow(double height, int numberOfGlass) {
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double height) {

        this.height = height;
    }
}
