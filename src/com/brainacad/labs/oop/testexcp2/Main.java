package com.brainacad.labs.oop.testexcp2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(50);
        }
        catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException");
            e.printStackTrace();
        }
    }
}
