package com.brainacad.tests.test211;

public class GenericCast {
    static <E> E cast(Object item) { // ERROR1
        return (E) item;
    }
    public static void main(String[] args) {
        Object o1 = 10;
        int i = 10;
        Integer anInteger = 10;
        Integer i1 = cast(o1); // ERROR2
        Integer i2 = cast(i); // ERROR3
        Integer i3 = cast(10); // ERROR4
        Integer i4 = cast(anInteger); // ERROR5
        System.out.print(""+i1+ i2+ i3+ i4);
    }
}
