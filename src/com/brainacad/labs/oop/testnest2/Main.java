package com.brainacad.labs.oop.testnest2;

/**
 * Created by Admin on 08.08.16.
 */
public class Main {
    public static void main(String[] args) {
        MyTestClass m1 = new MyTestClass();
        MyTestClass.MyStaticNested m2 = new MyTestClass.MyStaticNested();
        MyTestClass.MyInner m3 =  m1.new MyInner();
        m1.test();
    }
}
