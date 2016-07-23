package com.brainacad.lessons.lesson10;

public abstract class Shape {
    int a = 1;

    public Shape(int a) {
        this.a = a;
    }

    public abstract double  getArea();
}
