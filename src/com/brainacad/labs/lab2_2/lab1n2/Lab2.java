package com.brainacad.labs.lab2_2.lab1n2;

public class Lab2 {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix matrixB = new Matrix(new int[][]{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}});

        System.out.println(matrixA);
        System.out.println();
        System.out.println(matrixB);
        System.out.println();
        System.out.println("Matrix A + Matrix B:");
        System.out.println(Matrix.add(matrixA, matrixB));
        System.out.println();
        System.out.println("Matrix A * Matrix B:");
        System.out.println(Matrix.multiple(matrixA, matrixB));
    }
}
