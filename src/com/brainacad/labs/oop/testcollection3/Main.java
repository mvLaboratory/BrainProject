package com.brainacad.labs.oop.testcollection3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add("num_" + i);
        }

        List<String> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add("num_" + i);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Second");

        Iterator iteratorArr = list.iterator();
        while (iteratorArr.hasNext()) {
            System.out.println(iteratorArr.next());
        }

        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            arrList.add(listIterator.previous().toString());
        }
        System.out.println("***");
       // arrList.forEach(System.out::println);
        printElements(arrList);
    }

    public static void printElements(List<String> list) {
        if (list == null)
            return;

        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
