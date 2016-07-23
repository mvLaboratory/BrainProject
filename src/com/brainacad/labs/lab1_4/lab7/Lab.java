package com.brainacad.labs.lab1_4.lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mv on 02.07.2016.
 */
public class Lab {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number...");
        int num = Integer.parseInt(reader.readLine());

        System.out.println(num > 5 ? "Greater than 5" : "Smaller than 5");

        reader.close();
    }
}
