package com.lazarin.practicing.leetcode.arrays.medium;

//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {

    public static void main(String args[]){

        ContainerWithMostWater solution = new ContainerWithMostWater();

     /*   Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49*/
        System.out.println(solution.maxArea2(new int[]{1,8,6,2,5,4,8,3,7}));

        /*Input: height = [1,1]
        Output: 1*/
        System.out.println(solution.maxArea2(new int[]{1,1}));

        /*Input: height = [1,2,1]
        Output: 2*/
        System.out.println(solution.maxArea2(new int[]{1,2, 1}));
    }

    //approach 1 - brute force
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

    //approach 2 - most optimal
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
