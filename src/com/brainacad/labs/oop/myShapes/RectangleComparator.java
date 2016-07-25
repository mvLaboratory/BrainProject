package com.brainacad.labs.oop.myShapes;

import java.util.Comparator;

public class RectangleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Rectangle rec1 = (Rectangle) o1;
        Rectangle rec2 = (Rectangle) o2;

        if (rec1.calcArea() == rec2.calcArea()) return 0;
        if (rec1.calcArea() > rec2.calcArea()) return 1;
        else return -1;
    }
}
