package com.brainacad.labs.oop.myShapes;

public class InvalidShapeStringException extends Exception {
    public void printMessage() {
        System.out.println("Invalid string format!");
    }
}
