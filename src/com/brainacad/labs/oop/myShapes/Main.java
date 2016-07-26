package com.brainacad.labs.oop.myShapes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Parsing objects!%nEnter number of shapes: ");
        Scanner sc = new Scanner(System.in);
        int arrLenght = Integer.parseInt(sc.nextLine());
        Shape[] parseArr = new Shape[arrLenght];

        for (int i = 0; i < arrLenght; i++) {
            try {
                parseArr[i] = Shape.parseShape(sc.nextLine());
            }
            catch (InvalidShapeStringException e) {
                e.printMessage();
                e.printStackTrace();
            }
        }

        for (Shape parseShape : parseArr) {
            parseShape.draw();
        }

        sc.close();
    }
}
