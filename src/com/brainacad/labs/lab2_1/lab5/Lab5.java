package com.brainacad.labs.lab2_1.lab5;

import java.util.Random;

public class Lab5 {
    public static void main(String[] args) {
        Computer[] compArr = new Computer[5];
        String[] manufacturerArray = {"Intel", "Dell", "Acer", "HP", "Apple", "Sony", "Lenovo"};
        Random randomizer = new Random();

        for (int i = 0; i < 5; i++) {
            compArr[i] = new Computer(manufacturerArray[randomizer.nextInt(6)], randomizer.nextInt(999999), randomizer.nextFloat() * 10000, randomizer.nextInt(999999), randomizer.nextInt(999999));
        }

        for (Computer comp : compArr) {
            comp.view();
        }

        //Increasing prise by 10%
        System.out.println();
        System.out.println("Increasing prise by 10%:");
        System.out.println();
        for (Computer comp : compArr) {
            comp.setPrice(comp.getPrice() * 1.1f);
            comp.view();
        }

    }
}
