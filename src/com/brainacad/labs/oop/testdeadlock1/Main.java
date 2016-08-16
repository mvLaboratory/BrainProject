package com.brainacad.labs.oop.testdeadlock1;

public class Main {
    public static void main(String[] args) {
        MyObject mObj1 = new MyObject("Object0");
        MyObject mObj2 = new MyObject("Object1");
        MyObject mObj3 = new MyObject("Object2");

        MyThread th1 = new MyThread(mObj1, mObj2);
        MyThread th2 = new MyThread(mObj2, mObj3);
        MyThread th3 = new MyThread(mObj3, mObj1);

        th1.start();
        th2.start();
        th3.start();
    }
}
