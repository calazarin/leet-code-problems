package com.lazarin.blindlistandmore.arrays.medium;

//https://leetcode.com/problems/sort-colors/
public class SortColors {

    //bubble sort => t: o(n^2) / s: O(1)
    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    //swap
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    //approach 2
    //bucket sort => T: O(n); S:O(1)
    public void sortColors2(int[] nums){

    }

    //approach 3
    //only 1 single pass
    public void sortColors3(int[] nums){

    }
}
