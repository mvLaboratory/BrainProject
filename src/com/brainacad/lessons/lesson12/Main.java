package com.brainacad.lessons.lesson12;

class MyClass1 {}

abstract class MyClass2 {}

class MyClass3 extends MyClass1 {
    MyClass2 makeMyClass2() {
        return new MyClass2(){};
    }
}
