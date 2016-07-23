package com.brainacad.lessons.lesson9;

public class SportCar extends Car {
    public int data = 50;
    public int data2 = 50;
    int number = 0;

    public SportCar(int number) {
        this.number = number;
    }

    @Override
    public void method1() {
        System.out.println("sport method1");
    }

    public int method2() {
        System.out.println("method2");
        return 1;
    }

    @Override
    public void printSome() {
        System.out.println("2");
    }

    @Override
    protected void finalize() throws Throwable {
       // super.finalize();
        System.out.println(number + " - fA-fa-fa-fa");
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + ": ba-ba";
    }
}
