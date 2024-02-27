package com.lazarin.practicing.leetcode.arrays.medium.matrix;

//https://leetcode.com/problems/subrectangle-queries/description/
public class SubrectangleQueries {

    private int[][] rec;

    public SubrectangleQueries(int[][] rectangle) {
        this.rec = rectangle;
    }
    //T: (r*c)
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        //row1,col1 - upper left coordinate
        //row2,col2 - bottom right coordinate
        //newValue - value to be replaced everything in the subrectangle

        for(int r = row1; r <= row2; r++) {
            for(int c = col1; c <= col2; c++) {
                rec[r][c] = newValue;
            }
        }
    }

    //T:O(1)
    public int getValue(int row, int col) {
        //returns the current value of the coordinate (row,col)
        if(row >= 0 && row < rec.length &&
                col >=0 && col < rec[0].length){
            return rec[row][col];
        }
        return -1;
    }
}
