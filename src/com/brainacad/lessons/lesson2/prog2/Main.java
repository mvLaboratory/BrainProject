package com.brainacad.lessons.lesson2.prog2;

import java.util.Scanner;

/**
 * Created by mv on 29.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text:");
        String line = sc.nextLine();
        System.out.print("Your text is:");
        System.out.println(line);
    }
}
