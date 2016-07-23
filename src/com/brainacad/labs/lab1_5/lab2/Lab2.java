package com.brainacad.labs.lab1_5.lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab2 {
    public static void main(String[] args) {
        int x = -1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number x: ");
        try {
            x = Integer.parseInt(reader.readLine());
        }
        catch (IOException e) {
            System.out.println("Wrong entrance.");
            System.exit(-1);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid argument.");
            System.exit(-1);
        }

        //a
        if (x == 1) {
            System.out.println("-One");
        }
        else if (x == 2) {
            System.out.println("-Two");
        }
        else if (x == 3) {
            System.out.println("-Three");
        }
        else if (x == 4) {
            System.out.println("-Four");
        }
        else if (x == 5) {
            System.out.println("-Five");
        }
        else if (x == 6) {
            System.out.println("-Six");
        }
        else if (x == 7) {
            System.out.println("-Seven");
        }
        else if (x == 8) {
            System.out.println("-Eight");
        }
        else if (x == 9) {
            System.out.println("-Nine");
        }
        else {
            System.out.println("-Other");
        }

        //b
        switch(x) {
            case 1: {
                System.out.println("-One");
                break;
            }
            case 2: {
                System.out.println("-Two");
                break;
            }
            case 3: {
                System.out.println("-Three");
                break;
            }
            case 4: {
                System.out.println("-Four");
                break;
            }
            case 5: {
                System.out.println("-Five");
                break;
            }
            case 6: {
                System.out.println("-Six");
                break;
            }
            case 7: {
                System.out.println("-Seven");
                break;
            }
            case 8: {
                System.out.println("-Eight");
                break;
            }
            case 9: {
                System.out.println("-Nine");
                break;
            }
            default: {
                System.out.println("-Other");
                break;
            }
        }
    }
}
