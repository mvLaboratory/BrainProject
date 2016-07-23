package com.brainacad.lessons.lesson5;


import java.util.Arrays;

/**
 * Created by mv on 06.07.2016.
 */
public class Lesson5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr.length);
        System.out.println(arr[3]);

        System.out.println(arr[1]);
        Arrays.sort(arr);

        Lesson5 les = new Lesson5();
        les.culcSum(1, 2, 3, 4, 5);
        //les.doJob(null, null);
    }

    public int doJob(String str, int len) {
        return 1;
    }

    public int culcSum(int... val) {

        return 1;
    }
}
