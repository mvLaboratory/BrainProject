package com.brainacad.labs.oop.testcollection1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add("number_" + i);
        }

        list.forEach(System.out::println);
    }
}
