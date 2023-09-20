package com.lazarin.practicing.leetcode.binarysearch.medium;

import java.util.Arrays;

//https://leetcode.com/problems/koko-eating-bananas
public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);
        int answer = Integer.MAX_VALUE;

        int left = 1, right = piles[piles.length - 1];

        while(left <= right) {
            // k => rate
            int k = (right + left) / 2; ;
            long hours = 0;
            for(int pile : piles) {
                hours += Math.ceil((double) pile /k);
            }
            if(hours <= h){
                right = k - 1; //search on the left portion
                answer = Math.min(answer, k);
            } else {
                left = k + 1;  //too small, search on the right side now
            }
        }
        return answer;
    }

}
