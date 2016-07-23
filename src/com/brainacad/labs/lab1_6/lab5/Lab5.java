package com.brainacad.labs.lab1_6.lab5;

public class Lab5 {
    public static void main(String[] args) {
        final int SEARCH_NUMBER = 1;
        int[][] matrix = new int[][]{{1, 1, 1, 3, 4}, {2, 1, 3, 1, 2}, {2, 2, 3, 4, 1}, {3, 3, 3, 1, 4}};
        int lineDimension = matrix.length;
        int colDimension = matrix[0].length;

        for (int i = 0; i < lineDimension; i++) {
            System.out.print("Line " + (i + 1) + ": [");
            String searchResult = "";
            for (int j = 0; j < colDimension; j++) {
                if (matrix[i][j] == SEARCH_NUMBER) {
                    int startBound = j;
                    boolean isSequence = false;
                    while (++j < colDimension && matrix[i][j] == SEARCH_NUMBER) {
                        isSequence = true;
                    }
                    searchResult += !isSequence ? startBound + "," : startBound + "-" + (j - 1);
                }
            }
            if (searchResult.endsWith(","))
                System.out.println(searchResult.substring(0, searchResult.length() - 1) + "]");
            else
                System.out.println(searchResult + "]");
        }
    }
}
