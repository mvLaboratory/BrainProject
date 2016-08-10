package com.brainacad.labs.oop.testgenerics3;

import java.util.Arrays;

/**
 * Created by mv on 08.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyMixer mixer = new MyMixer<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12, 13, 14, 15});
        mixer.shuffle();
        System.out.println(Arrays.toString(mixer.arr));

        System.out.println("***");

        MyMixer mixer2 = new MyMixer<>(new String[] {"one", "two", "three", "four", "fine", "six", "seven"});
        mixer2.shuffle();
        System.out.println(Arrays.toString(mixer2.arr));
    }
}
