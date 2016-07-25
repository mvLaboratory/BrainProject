package com.brainacad.labs.oop.myShapes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Shape[] arr = {
//                new Rectangle("Red", 3, 5),
//                new Rectangle("green", 6, 8),
//                new Rectangle("black", 8, 8),
//                new Rectangle("white", 17, 20),
//                new Rectangle("yellow", 20, 22),
//                new Circle("GREEN", 10),
//                new Circle("white", 5),
//                new Triangle("black", 5, 5, 5),
//                new Triangle("green", 15, 10, 7)
//        };
//
//        double sumArea = 0, recArea = 0, triArea = 0, circleArea = 0;
//        for (Shape shape : arr) {
//            double area = shape.calcArea();
//            sumArea += area;
//            if (shape instanceof Circle) {
//                circleArea += area;
//            }
//            else if (shape instanceof Rectangle) {
//                recArea += area;
//            }
//            else if (shape instanceof Triangle) {
//                triArea += area;
//            }
//            //System.out.printf(shape + ", area is:  %.3f%n", area);
//            shape.draw();
//        }
//
//        System.out.printf("%nSum area is: %.3f%n", sumArea);
//        System.out.printf("%nRectangles total area is: %.2f%n", recArea);
//        System.out.printf("Circle total area is: %.2f%n", circleArea);
//        System.out.printf("Triangle total area is: %.2f%n", triArea);
//
//        //Lesson 28
//        System.out.printf("%n%nLesson 28%n");
//        Rectangle[] arr2 = {new Rectangle("Red", 3, 5),
//                new Rectangle("green", 6, 8),
//                new Rectangle("black", 8, 8),
//                new Rectangle("white", 17, 20),
//                new Rectangle("Red", 16, 5),
//                new Rectangle("green", 12, 22),
//                new Rectangle("yellow", 131, 1)};
//
//        int compareIndex1 = 0, compareIndex2 = 2;
//        System.out.println(arr2[compareIndex1].compareTo(arr[compareIndex2]) > 0 ? arr[compareIndex1] + " is greater than " + arr[compareIndex2] : arr[compareIndex2] + "is greater than " + arr[compareIndex1]);
//
//        Arrays.sort(arr2, new RectangleComparator());
//
//        for (Shape rec : arr2) {
//            System.out.printf("Rectangle: " + rec + " with area %.3f%n", rec.calcArea());
//        }
//
//        System.out.println();
        System.out.printf("Parsing objects!%nEnter number of shapes: ");
        Scanner sc = new Scanner(System.in);
        int arrLenght = Integer.parseInt(sc.nextLine());
        Shape[] parseArr = new Shape[arrLenght];

        for (int i = 0; i < arrLenght; i++) {
            parseArr[i] = Shape.parseShape(sc.nextLine());
        }

        for (Shape parseShape : parseArr) {
            parseShape.draw();
        }

        sc.close();

//        System.out.println(Shape.parseShape("Triangle:GREEN:9,7,12"));
//        System.out.println(Shape.parseShape("Rectangle:Black:9,7"));
//        System.out.println(Shape.parseShape("Circle:White:9"));
//        System.out.println(Shape.parseShape("Cirdcle:White:9"));
    }
}
