package com.lazarin.practicing.leetcode.arrays.medium.matrix;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;

        while(left < right && top < bottom){
            //get every i in the top row
            for(int i = left; i < right; i++){
                output.add(matrix[top][i]);
            }
            top++;
            //get every i in the right column
            for(int i = top; i < bottom; i++){
                output.add(matrix[i][right - 1]);
            }
            right--;
            if(!(left < right && top < bottom)){
                break;
            }
            //get every i in the bottom row
            for(int i = right - 1; i >= left; i--){
                output.add(matrix[bottom - 1][i]);
            }
            bottom--;
            //get every i in the left column
            for(int i = bottom - 1; i >= top; i--){
                 output.add(matrix[i][left]);
            }
            left++;
        }
        return output;
    }

    public List<Integer> spiralOrder2(int[][] matrix){
        List<Integer> output = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return output;
        }
        int right = matrix[0].length - 1;
        int left = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int size = matrix.length * matrix[0].length;

        while(output.size() < size){

            for(int i = top; i <= right && output.size() < size; i++){
                output.add(matrix[top][i]);
            }
            top--;
            for(int i = top; i <= bottom && output.size() < size; i++){
                output.add(matrix[i][right]);
            }
            right--;
            for(int i = right; i >= left && output.size() < size; i--){
                output.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom; i >= top && output.size() < size; i--){
                output.add(matrix[i][left]);
            }
            left++;
        }
        return output;
    }
}
