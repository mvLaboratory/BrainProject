package com.brainacad.labs.oop.io.io2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0)
            return;

        String fileName = args[0];

        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
