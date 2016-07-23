package com.brainacad.labs.lab2_2.lab1n2;


public class Matrix {
    private static final int BOUND = 3;
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getElement(int i, int j) {
        return matrix[i][j];
    }

    public static Matrix add(Matrix matrixA, Matrix matrixB) {
        int[][] matrixC = new int[BOUND][BOUND];
        for (int i = 0; i < BOUND; i++) {
            for (int j = 0; j < BOUND; j++) {
                matrixC[i][j] = matrixA.getElement(i, j) + matrixB.getElement(i, j);
            }
        }
        return new Matrix(matrixC);
    }

    public static Matrix multiple(Matrix matrixA, Matrix matrixB) {
        int[][] matrixC = new int[BOUND][BOUND];
        for (int i = 0; i < BOUND; i++) {
            for (int j = 0; j < BOUND; j++) {
                for (int k = 0; k < BOUND; k++) {
                    matrixC[i][j] = matrixC[i][j] + (matrixA.getElement(i, k) * matrixB.getElement(k, j));
                }
            }
        }
        return new Matrix(matrixC);
    }

    @Override
    public String toString() {
        String returnString = "";
        for (int i = 0; i < BOUND; i++) {
            for (int j = 0; j < BOUND; j++) {
                returnString += this.matrix[i][j] + (j == (BOUND - 1) ? "" : " ");
            }
            returnString += i == (BOUND - 1) ? "" : "\n";
        }
        return returnString;
    }
}
