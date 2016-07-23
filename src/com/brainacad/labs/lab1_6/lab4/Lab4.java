package com.brainacad.labs.lab1_6.lab4;

import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int tmp = 0;
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }


       // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int searchEll = 10;
        System.out.println(searchEll + "'s index: " + Arrays.binarySearch(arr, searchEll));
    }
}
