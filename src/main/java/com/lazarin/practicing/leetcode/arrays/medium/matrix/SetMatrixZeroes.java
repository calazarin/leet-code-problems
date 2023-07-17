package com.lazarin.practicing.leetcode.arrays.medium.matrix;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {

   // Time Complexity : O(M×N)
   // Space Complexity : O(1)
    public void setZeroes(int[][] matrix) {

        //O(N)
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean rowZero = false;

        //determine which rows and columns need to be zero
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(matrix[r][c] == 0){
                    matrix[0][c] = 0;
                    if(r > 0){
                        matrix[r][0] = 0;
                    } else {
                        rowZero = true;
                    }
                }
            }
        }

        for(int r = 1; r < rows; r++){
            for(int c = 1; c < cols; c++){
                if(matrix[0][c] == 0 || matrix[r][0] == 0){
                    matrix[r][c] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int r = 0; r < rows; r++){
                matrix[r][0] = 0;
            }
        }

        if(rowZero){
            for(int c = 0; c < cols; c++){
                matrix[0][c] = 0;
            }
        }
    }

    //T: O(mxn)
    //S: O(m+n)
    public void setZeroes2(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroColumns = new HashSet<>();

        // Essentially, we mark the rows and columns that are to be made zero
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                if(matrix[r][c] == 0){
                    zeroRows.add(r);
                    zeroColumns.add(c);
                }
            }
        }

        // Iterate over the array once again and using the rows and cols sets, update the elements.
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                if(zeroColumns.contains(r) || zeroRows.contains(r)){
                    matrix[r][c] = 0;
                }
            }
        }
    }

}
