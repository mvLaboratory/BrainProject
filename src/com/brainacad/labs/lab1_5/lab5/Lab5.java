package com.brainacad.labs.lab1_5.lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = -1;
        System.out.print("Enter limit: ");

        try {
            n = Integer.parseInt(reader.readLine());
        }
        catch (IOException e) {
            System.out.println("Wrong entrance!");
            System.exit(-1);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid limit!");
            System.exit(-1);
        }

        int sum = 0;
        double avg = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        avg = (float) sum / n;
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);
    }
}
