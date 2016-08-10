package com.brainacad.tests.test210;

public enum PrinterType {


    DOTMATRIX(5), INKJET(10), LASER(50);
    private int pagePrintCapacity;
    private PrinterType(int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }
    public int getPrintPageCapacity() {
        return pagePrintCapacity;
    }
}
