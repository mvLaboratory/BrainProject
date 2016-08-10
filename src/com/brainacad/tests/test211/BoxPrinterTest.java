package com.brainacad.tests.test211;

class BoxPrinter<T> {

    private String val;
    public BoxPrinter(String arg) {
        val = arg;
    }
    public String toString() {
        return "[" + val + "]";
    }
}

public class BoxPrinterTest {
    public static void main(String []args) {
        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
        System.out.println(value2);
    }
}