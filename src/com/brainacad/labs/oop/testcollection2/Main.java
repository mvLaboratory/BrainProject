package com.brainacad.labs.oop.testcollection2;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomizer = new Random();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int pos = list.size() > 0 ? randomizer.nextInt(list.size()) : 0;
            list.add(pos, "number_" + i);
        }

        list.forEach(System.out::println);
    }
}
