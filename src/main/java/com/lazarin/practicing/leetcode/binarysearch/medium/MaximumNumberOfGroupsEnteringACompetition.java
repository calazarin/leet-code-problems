package com.lazarin.practicing.leetcode.binarysearch.medium;

//https://leetcode.com/problems/maximum-number-of-groups-entering-a-competition/description/
public class MaximumNumberOfGroupsEnteringACompetition {

    /**
     * approach - uses binary search + sum of integers formula
     * T: O(lohN)
     * S: O(1)
     */
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        int start = 0;
        int end = 1000;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2; //find a possible # of groups
            int sum = mid * (mid + 1) / 2;

            if (sum <= n) { //check if the sum of all elements match with input size; adjust lest and end
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}