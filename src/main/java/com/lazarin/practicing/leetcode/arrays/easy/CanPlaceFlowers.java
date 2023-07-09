package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/can-place-flowers/
public class CanPlaceFlowers {

    //T: O(N)
    //S: O(1)
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for(int i = 0; i < flowerbed.length; i++){

            if(flowerbed[i] == 0){ //is the current position empty?

                //checking if we are allowed to put a new plant here
                boolean left = i == 0 || flowerbed[i - 1] == 0;
                boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

                if(left && right){
                    flowerbed[i] = 1;
                    count++;
                }
            }

        }
        return count >= n;
    }
}