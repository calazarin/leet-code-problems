package com.lazarin.blindlistandmore.arrays.medium;

//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {

    public static void main(String args[]){

    }

    //approach 1
    //T: O (n^2)
    //S: O(1)
    public int maxArea(int[] height) {
        int max = 0;
        //setup left pointer
        for(int i = 0; i < height.length; i++){

            //setup right pointer
            for(int j = i + 1; j < height.length; j++){
                var currentArea = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, currentArea);
            }
        }
        return max;
    }

    //approach 2
    //T: O (N) - linear
    //S: O(1) - we do not need any extra space
    public int maxArea2(int[] height) {

        int max = 0;
        int left = 0;
        int right = height.length - 1; //last index
        while(left < right){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currentArea);
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
