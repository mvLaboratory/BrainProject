package com.brainacad.labs.oop.testgenerics2;

public class MyTestMethod {
    public static <T extends Number> int calcNum(T[] arr, T maxElem) {
        int counter = 0;
        for (T arrElem : arr) {
            if (arrElem.doubleValue() > maxElem.doubleValue())
                counter++;
        }
        return counter;
    }

    public static <T extends Number> int calcSum(T[] arr, T maxElem) {
        int counter = 0;
        for (T arrElem : arr) {
            if (arrElem.doubleValue() > maxElem.doubleValue())
                counter += arrElem.doubleValue();
        }
        return counter;
    }
}
