package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
public class KidsWithTheGreatestNumberOfCandies {

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