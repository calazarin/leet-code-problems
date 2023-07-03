package com.lazarin.learning.leetcode.matrix;

public class MatrixMain {

    public static void main(String args[]){
        // declare & initialize 2D arrays for int and string
        int[][] matrix1 = new int[2][2];
        int matrix2[][] = new int[2][3];

        //the size of matrix3 will be 4x4
        int[][] matrix3 = {
            { 3, 2, 1, 7 },
            { 9, 11, 5, 4 },
            { 6, 0, 13, 17 },
            { 7, 21, 14, 15 }
        };

        printMatrix(matrix3);

        String[][] matrix4 = new String[2][2];

        //the size of matrix5 will be 2x3
        // 3 cols because at max there are 3 columns
        String[][] matrix5 = { { "a", "lion", "meo" },
                { "jaguar", "hunt" } };

        printMatrix(matrix5);
    }

    private static void printMatrix(int[][] toBePrinted){
        for(int i = 0 ; i < toBePrinted.length; i++){
            for(int j = 0; j < toBePrinted[i].length; j++){
                System.out.print(toBePrinted[i][j] + " - ");
            }
            System.out.print("\n");
        }
    }

    private static void printMatrix(String[][] toBePrinted){
        for(int i = 0 ; i < toBePrinted.length; i++){
            for(int j = 0; j < toBePrinted[i].length; j++){
                System.out.print(toBePrinted[i][j] + " - ");
            }
            System.out.print("\n");
        }
    }

}
