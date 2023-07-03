package com.lazarin.learning.leetcode.arrays;

public class ThreeDArray {

    public static void main(String args[]){

        //2d array
        int[][] arr = new int[10][20];
        int[][] arr2 = {{1, 2}, {3, 4}};

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr2[" + i + "][" + j + "] = "
                        + arr2[i][j]);

        //3d array
        // an array of two – dimensional array for easier understanding.
        int[][][] _3darray = new int[1][1][1];

        int[][][] _3darray_2 = new int[][][]
        {
            {
                {1, 2}, {3, 4}
            },
            {
                {5, 6}, {7, 8}
            }
        };



    }
}
