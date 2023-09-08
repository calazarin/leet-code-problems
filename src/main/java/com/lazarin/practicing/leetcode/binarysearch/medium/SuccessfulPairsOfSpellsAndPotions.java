package com.lazarin.practicing.leetcode.binarysearch.medium;

import java.util.Arrays;

//https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
public class SuccessfulPairsOfSpellsAndPotions {

    //approach 1 - using a binary search
    //T: O(nlogm) + mlogm - sort potions + binary
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int[] pairs = new int[spells.length];
        Arrays.sort(potions);

        for(int i  = 0; i < spells.length; i++) {
            int left = 0, right = potions.length - 1;

            while(left <= right) {
                int mid = left + (right - left) / 2;
                long calc = (long)spells[i] * potions[mid];
                if(calc >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            pairs[i] = potions.length - left;
        }

        return pairs;
    }
}
