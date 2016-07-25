package com.brainacad.labs.oop.myShapes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rectangle extends Shape implements Comparable {
    private double width, height;
    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public static Rectangle parseRectangle(String desc) {
        Pattern pat = Pattern.compile("(^([A-Za-z0-9_]*):([A-Za-z0-9_]*):(([0-9]*),){1}[0-9]*$)");
        Matcher matcher = pat.matcher(desc);

        if (!matcher.matches()) {
            System.err.println("Wrong parameters format.");
            return null;
        }

        Pattern splitter = Pattern.compile("(:|,)");
        String[] args = splitter.split(desc);

        return new Rectangle(args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]));
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + super.getShapeColor() + ", width = " + width + ", height = " + height;
    }

    @Override
    public int compareTo(Object o) {
        Rectangle that = (Rectangle) o;

        if (that.calcArea() == calcArea()) return 0;
        if (that.calcArea() < calcArea()) return 1;
        else
            return -1;
    }

}
