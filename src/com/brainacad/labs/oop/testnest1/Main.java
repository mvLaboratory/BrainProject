package com.brainacad.labs.oop.testnest1;

/**
 * Created by Admin on 08.08.16.
 */
public class Main {
    public static void main(String[] args) {
        MyPhone phone = new MyPhone();
        phone.swichOn();
        System.out.println();
        phone.showPhoneBook();
        System.out.println();
        phone.call(1);
    }
}
