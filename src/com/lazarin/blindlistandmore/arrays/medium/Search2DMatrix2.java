package com.lazarin.blindlistandmore.arrays.medium;

//https://leetcode.com/problems/search-a-2d-matrix-ii/description/
public class Search2DMatrix2 {

    public static void main(String args[]){

    }

    //approach 1: O(m + n)
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

}
