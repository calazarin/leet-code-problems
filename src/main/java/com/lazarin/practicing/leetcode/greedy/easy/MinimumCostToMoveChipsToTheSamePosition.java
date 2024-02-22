package com.lazarin.practicing.leetcode.greedy.easy;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class MinimumCostToMoveChipsToTheSamePosition {

    //approach 1 - count the chips in odd and even positions
    //as the cost to move all of them to a unique place is 0
    //then move the smallest stack to the other position with cost 1
    //T: O(N); S:O(1)
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int i : position) {
            if(i % 2 == 1) odd++;
            else even++;
        }
        return Math.min(even, odd);
    }
}
