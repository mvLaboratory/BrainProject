package com.brainacad.lessons.lesson12;

public class Main {
    public static void main(String[]args) {
        int[] arr = new int[2];
        try {
            System.out.println(arr[0] / arr[1]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            //e = new ArithmeticException();
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("sdf" + e);
        }
    }
}
