package com.brainacad.labs.lab2_2.lab2_4;

public class Person {
    private String firstName, lastName, gender;
    private int age, phoneNumber;

    public Person() {
        this(-1, -1);
    }

    public Person(int age, int phoneNumber) {
        this("John", "Male", age, phoneNumber);
    }

    public Person(String gender) {
        if (gender.endsWith("Female")) {
            this.firstName = "Jane";
            this.lastName = "Doe";
            this.gender = "Female";
            this.age = -1;
            this.phoneNumber = -1;
        }
        else
            this.firstName = "John";
            this.lastName = "Doe";
            this.gender = "Male";
            this.age = -1;
            this.phoneNumber = -1;
    }

    public Person(String gender, int age, int phoneNumber) {
        if (gender.endsWith("Female")) {
            this.firstName = "Jane";
            this.lastName = "Doe";
            this.gender = "Male";
            this.age = age;
            this.phoneNumber = phoneNumber;
        }
        else
            this.firstName = "John";
            this.lastName = "Doe";
            this.gender = "Male";
            this.age = age;
            this.phoneNumber = phoneNumber;
    }

    public Person(String firstName, String gender, int age, int phoneNumber) {
        this(firstName, "Doe", gender, age, phoneNumber);
    }

    public Person(String firstName, String lastName, String gender, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}
