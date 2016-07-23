package com.brainacad.labs.lab2_3.lab5;

public class Lab235 {
    public static void main(String[] args) {
        MyWindow[] winArr = {new MyWindow(10, 20), new MyWindow(), new MyWindow(15, 30, 5), new MyWindow(15, 30, 5, "Black", true)};

        for (MyWindow mWin : winArr) {
            mWin.printFields();
        }
    }
}
