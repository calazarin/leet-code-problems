package com.lazarin.practicing.leetcode.math.easy;

//https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {

    public static void main(String args[]){
        ArrangingCoins ac = new ArrangingCoins();
        System.out.println(ac.arrangeCoins(5));
        System.out.println(ac.arrangeCoins(1));
    }

    //binary search approach
    //more like a medium problem because it uses gauss formula
    //T: O(logn)
    //S: O(1)
    public int arrangeCoins(int n){
        long left = 0, right = n;
        long mid, curr;
        while (left <= right) {
            mid = left + (right - left) / 2;
            curr = mid * (mid + 1) / 2;

            if (curr == n) return (int)mid;

            if (n < curr) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int)right;
    }
}
