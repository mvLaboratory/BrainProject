package com.brainacad.labs.oop.myShapes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Circle extends Shape implements Comparable {
    private double radius;
    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public static Circle parseCircle(String desc) {
        Pattern pat = Pattern.compile("(^([A-Za-z0-9_]*):([A-Za-z0-9_]*):[0-9]*$)");
        Matcher matcher = pat.matcher(desc);

        if (!matcher.matches()) {
            System.err.println("Wrong parameters format.");
            return null;
        }

        Pattern splitter = Pattern.compile("(:|,)");
        String[] args = splitter.split(desc);

        return new Circle(args[1], Double.parseDouble(args[2]));
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + super.getShapeColor() + ", radius = " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return radius == circle.radius;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public int compareTo(Object o) {
        Circle that = (Circle) o;

        if (that.calcArea() == calcArea()) return 0;
        if (that.calcArea() < calcArea()) return 1;
        else
            return -1;
    }
}
