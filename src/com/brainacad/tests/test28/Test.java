package com.brainacad.tests.test28;

/**
 * Created by mv on 25.07.2016.
 */
public class Test {
    public static void main(String[] args) {
        Integer i2 = new Integer(5);
        byte b = i2.byteValue();                   //line 1
        short s = i2.shortValue();                 //line 2
        double d = i2.doubleValue();           //line 3
        System.out.print(b+" "+s+" "+d);
    }

}
