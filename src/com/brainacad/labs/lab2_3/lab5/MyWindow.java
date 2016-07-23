package com.brainacad.labs.lab2_3.lab5;

/**
 * Created by mv on 13.07.2016.
 */
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

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height, numberOfGlass, "White", false);
    }

    public MyWindow(double width, double height) {
        this(width, height, 2);
    }

    public void printFields() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
