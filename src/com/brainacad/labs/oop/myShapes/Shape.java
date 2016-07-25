package com.brainacad.labs.oop.myShapes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor.toUpperCase();
    }

    public abstract double calcArea();

    public static Shape parseShape(String desc) {
        Pattern pat = Pattern.compile("(^([A-Za-z0-9_]*):([A-Za-z0-9_]*):((([0-9]+,)+)([0-9]+)|([0-9]+))$)");
        Matcher matcher = pat.matcher(desc);

        if (!matcher.matches()) {
            System.err.println("Wrong parameters format.");
            return null;
        }

        Pattern splitter = Pattern.compile("(:|,)");
        String[] args = splitter.split(desc);

        if (args.length == 0)
            return null;

        String shapeName = args[0];
        String className = "com.brainacad.labs.oop.myShapes." + shapeName;

        Class shapeClass;
        try {
            shapeClass = Class.forName(className);
        }
        catch (ClassNotFoundException e) {
            System.err.println("Wrong shape name");
            return null;
        }

        try {
            Method parser = shapeClass.getMethod("parse" + shapeName, java.lang.String.class);
            return (Shape) parser.invoke(null, desc);

//        Constructor[] constructorsArr = shapeClass.getConstructors();
//        if (constructorsArr.length == 0) {
//            System.err.println("Wrong shape class");
//            return null;
//        }
//        Constructor constructor = constructorsArr[0];
//
//        Object[] parameters = new Object[args.length - 1];
//        parameters[0] = args[1];
//        for (int i = 2; i < args.length; i++) {
//            parameters[i-1] = Double.parseDouble(args[i]);
//        }
//
//        try {
//            return (Shape) constructor.newInstance(parameters);
        }
        catch (Exception e) {
            System.err.println("Wrong shape parameters");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Shape, color is: " + shapeColor.toUpperCase();
    }

    @Override
    public void draw() {
        System.out.printf(this.toString() + ", area is : %.3f%n", calcArea());
    }
}
