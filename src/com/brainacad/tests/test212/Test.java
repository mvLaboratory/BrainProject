package com.brainacad.tests.test212;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Deque<String> myDeque = new ArrayDeque<>();
        myDeque.add("one");
        myDeque.add("two");
        myDeque.add("three");
        System.out.println(myDeque);
        System.out.println(myDeque.remove());
    }
}