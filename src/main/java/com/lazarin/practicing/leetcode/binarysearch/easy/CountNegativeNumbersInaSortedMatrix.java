package com.lazarin.practicing.leetcode.binarysearch.easy;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegativeNumbersInaSortedMatrix {

    //approach 1 - brute force
    //T: O(N * M)
    public int countNegatives(int[][] grid) {
        int count = 0;

        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[r].length; c++) {
                if(grid[r][c] < 0){
                    count++;
                }
            }

        }

        return count;
    }

    //approach 2 - binary search
    public int countNegatives_2(int[][] grid) {
        int count = 0;

        for(int[] r : grid){
            int lastPositiveIndex = findLastPositive(r);
            if(r.length - lastPositiveIndex != -1) {
                count += r.length - lastPositiveIndex;
            }
        }

        return count;
    }

    private int findLastPositive(int[] arr) {
        int s = arr.length;
        int l = 0, r = s - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(arr[mid] < 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

}
