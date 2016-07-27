package com.brainacad.labs.oop.testexcp2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(50);
            //assert false;
        }
        catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException");
            e.printStackTrace();
        }
//        finally {
//            System.out.println("this is finnaly");
//        }
    }
}
