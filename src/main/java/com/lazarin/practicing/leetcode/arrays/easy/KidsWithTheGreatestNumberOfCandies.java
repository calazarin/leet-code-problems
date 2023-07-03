package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String args[]){
        KidsWithTheGreatestNumberOfCandies solution =
                new KidsWithTheGreatestNumberOfCandies();

       /* Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]*/
        var resp = solution.kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        resp.forEach(System.out::println);

        System.out.print("\n \n");

        /*Input: candies = [4,2,1,1,2], extraCandies = 1
        Output: [true,false,false,false,false] */
        var resp2 = solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1);
        resp2.forEach(System.out::println);

        System.out.print("\n \n");

        /*Input: candies = [12,1,12], extraCandies = 10
        Output: [true,false,true]*/
        var resp3 = solution.kidsWithCandies(new int[]{12,1,12}, 10);
        resp3.forEach(System.out::println);
    }

    //T:O(n)
    //S: O(1)
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max_val = -1;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max_val){
                max_val = candies[i];
            }
        }

        for(int j = 0; j < candies.length; j++){
            int curr = candies[j];
            if(curr + extraCandies >= max_val){
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}