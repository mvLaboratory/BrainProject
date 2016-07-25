package com.brainacad.labs.oop.myShapes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Triangle extends Shape implements Comparable {
    private double a, b, c;
    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle parseTriangle(String desc) {
        Pattern pat = Pattern.compile("(^([A-Za-z0-9_]*):([A-Za-z0-9_]*):(([0-9]*),){2}[0-9]*$)");
        Matcher matcher = pat.matcher(desc);

        if (!matcher.matches()) {
            System.err.println("Wrong parameters format.");
            return null;
        }

        Pattern splitter = Pattern.compile("(:|,)");
        String[] args = splitter.split(desc);

        return new Triangle(args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]));
    }

    @Override
    public double calcArea() {
        double s = (a + b + c) / 2d;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + super.getShapeColor() + ", a = " + a + ", b = " + b + ", c = " + c;
    }

    @Override
    public int compareTo(Object o) {
        Triangle that = (Triangle) o;

        if (that.calcArea() == calcArea()) return 0;
        if (that.calcArea() < calcArea()) return 1;
        else
            return -1;
    }
}