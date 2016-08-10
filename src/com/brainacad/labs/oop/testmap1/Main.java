package com.brainacad.labs.oop.testmap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTranslator trans = new MyTranslator();
        trans.addNewWord("cat", "кіт");
        trans.addNewWord("caught", "впіймати");
        trans.addNewWord("mouse", "миша");

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        for (String word : words) {
            System.out.print(trans.translate(word) + " ");
        }

        sc.close();
    }
}
