package com.brainacad.labs.oop.testmygen;

/**
 * Created by mv on 10.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        new MyNumGenerator(5, 64).generate().forEach(System.out::println);
        System.out.println("***");
        new MyNumGenerator(5, 64).generateDistinct().forEach(ell -> System.out.print(ell + " "));
    }
}
