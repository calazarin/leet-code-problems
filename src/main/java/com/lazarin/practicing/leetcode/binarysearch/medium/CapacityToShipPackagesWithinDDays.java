package com.lazarin.practicing.leetcode.binarysearch.medium;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class CapacityToShipPackagesWithinDDays {

    /**
     * approach - binary search
     * ship capacity in any days: the maximum of all weights
     * answer can be only between the maximum element and sum of all elements in the array
     * T: O(n * logM) where M is the max value in weights and N the amount of weights
     */
    public int shipWithinDays(int[] weights, int days) {
        int minCapacity = Integer.MIN_VALUE;
        int maxCapacity = 0;

        for(int w : weights) {
            minCapacity = Math.max(w, minCapacity);
            maxCapacity += w;
        }

        int result = maxCapacity;

        while (minCapacity <= maxCapacity) {
            int cap = (minCapacity + maxCapacity) / 2;
            if (canShip(cap, days, weights)) {
                result = Math.min(result, cap);
                maxCapacity = cap - 1;
            } else {
                minCapacity = cap + 1;
            }
        }
        return result;
    }

    private boolean canShip(int capacity, int days, int[] weights){
        int ships = 1;
        int currCap = capacity;
        for(int w : weights){
            if(currCap - w < 0){
                ships += 1;
                currCap = capacity;
            }
            currCap -= w;
        }
        return ships <= days;
    }

}
