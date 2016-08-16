package com.brainacad.labs.oop.testconcoll1;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurentMap {
    private ConcurrentHashMap<Integer, String> myMap = new ConcurrentHashMap<>();
 //   private HashMap<Integer, String> myMap = new HashMap<>();

    public synchronized void put(int i, String s) {
        System.out.println("puting " + i);
        myMap.put(i, s);
    }

}
