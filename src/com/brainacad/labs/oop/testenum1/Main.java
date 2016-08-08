package com.brainacad.labs.oop.testenum1;

import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day) {
                case MONDAY:
                    System.out.println("MONDAY");
                    break;
                case SUNDAY:
                    System.out.println("SUNDAY");
            }
            // System.out.println(day);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String dayName = sc.nextLine();
        MyDayOfWeek today = MyDayOfWeek.MONDAY;
        try {
            today = MyDayOfWeek.valueOf(dayName.toUpperCase());
        }
        catch (Exception e) {
            System.err.println("Wrong argument");
        }
        MyDayOfWeek nextDay = MyDayOfWeek.nextDay(today);
        System.out.println(nextDay);
    }
}
