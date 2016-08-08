package com.brainacad.labs.oop.testnest1;

import java.util.Arrays;

public class MyPhone {

    public MyPhone() {

    }

    public void swichOn() {
        System.out.println("Loading PhoneBook records…");

        MyPhoneBook.addPhoneNumber("Vova", "0979903668");
        MyPhoneBook.addPhoneNumber("Ira", "0965564872");
        MyPhoneBook.addPhoneNumber("Ula", "0978246913");
        MyPhoneBook.addPhoneNumber("Demien", "0966666666");
        MyPhoneBook.addPhoneNumber("Sasha", "067987654");
        MyPhoneBook.addPhoneNumber("Boris", "0679878888");
        MyPhoneBook.addPhoneNumber("Anna", "0501237777");
        MyPhoneBook.addPhoneNumber("Vasa", "0505559768");
        MyPhoneBook.addPhoneNumber("Oksana", "0965487213");
        MyPhoneBook.addPhoneNumber("Igor", "09611223365");

        System.out.println("OK!");
    }

    public void call(int index) {
        if (index < 0 || index >= 10) {
            System.out.println("Invalid number index!");
            return;
        }

        System.out.println(MyPhoneBook.phoneNumbers[index]);
    }

    public void showPhoneBook() {
        System.out.println("Sort by name:");
        MyPhoneBook.sortByName();
        MyPhoneBook.printPhoneBook();

        System.out.println("Sort by phone:");
        MyPhoneBook.sortNyNumber();
        MyPhoneBook.printPhoneBook();
    }

    public static class MyPhoneBook {
        private static int phoneBookLength = 0;
        private static PhoneNumber[] phoneNumbers = new PhoneNumber[10];

        public static void addPhoneNumber(String name, String phone) {
            phoneNumbers[phoneBookLength] = new PhoneNumber(name, phone);
            phoneBookLength++;
        }

        public static void printPhoneBook() {
            System.out.println("My phone book:");
            for (PhoneNumber number : phoneNumbers) {
                System.out.println(number);
            }
        }

        public static void sortByName() {
            Arrays.sort(phoneNumbers, (number1, number2) -> number1.name.compareTo(number2.name));
        }

        public static void sortNyNumber() {
            Arrays.sort(phoneNumbers, (number1, number2) -> number1.phone.compareTo(number2.phone));
        }

        public static class PhoneNumber {
            private String name, phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "PhoneNumber{" +
                        "name='" + name + '\'' +
                        ", phone='" + phone + '\'' +
                        '}';
            }
        }
    }

    public class Camera {

    }

    public class MemoryCard {

    }

    public class SimCard {

    }

    public static class TouchScreen {

    }

    public static class PowerOnButton {

    }

    public class HeadPhones {

    }

    public static class PhoneBattery {

    }

    public class PhoneCharger {

    }

    public static class PhoneDisplay {

    }

    public class PhoneSpeaker {

    }
}
