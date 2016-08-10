package com.brainacad.labs.oop.testmygen;

import java.util.*;

public class MyNumGenerator {
    private int numOfElm, maxNumb;
    private Random randomizer = new Random();

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate() {
        List<Integer> returnList = new ArrayList<>();

        for (int i = 0; i < numOfElm; i++) {
            returnList.add(randomizer.nextInt(maxNumb));
        }

        return returnList;
    }

    public Set<Integer> generateDistinct() {
        Set<Integer> resultSet = new HashSet<>();

        while (resultSet.size() != numOfElm) {
            resultSet.add(randomizer.nextInt(maxNumb));
        }

        return resultSet;
    }
}
