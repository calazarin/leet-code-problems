package com.lazarin.practicing.leetcode.arrays.medium.matrix;

//https://leetcode.com/problems/rotate-image/
public class RotateImage {

    //rotate the corners from outside to inside until left matches right
    //T: O(n2)
    //S: O(1)
    public void rotate(int[][] matrix) {

        int left = 0;
        int right = matrix[0].length - 1;

        while(left < right){

            for(int i = 0; i < right - left; i++){

                int top = left;
                int bottom = right;
                //save top left
                int topLeft = matrix[top][left + i];
                //move bottom left into top left
                matrix[top][left + i] = matrix[bottom - i][left];

                //move bottom right into bottom left
                matrix[bottom - i][left] = matrix[bottom][right - i];

                //move top right into bottom right
                matrix[bottom][right-i] = matrix[top + i][right];

                //move top left into top right
                matrix[top + i][right] = topLeft;
            }
            right --;
            left++;
        }
    }

    //first converts columns into rows
    //them place them in the opposite direction
    public void rotate2(int[][] matrix){

        for(int r = 0; r < matrix.length; r++) {
            for (int c = r; c < matrix[0].length; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length/2; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][matrix.length-1-c];
                matrix[r][matrix.length-1-c] = temp;
            }
        }

    }

}
