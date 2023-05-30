package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/can-place-flowers/
public class CanPlaceFlowers {

    public static void main(String args[]) {

        CanPlaceFlowers solution = new CanPlaceFlowers();

        /*Input: flowerbed = [1,0,0,0,1], n = 1
        Output: true*/
        System.out.println(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));

      /*  Input: flowerbed = [1,0,0,0,1], n = 2
        Output: false*/
        System.out.println(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }

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