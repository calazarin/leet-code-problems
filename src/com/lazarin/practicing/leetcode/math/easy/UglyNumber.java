package com.lazarin.practicing.leetcode.math.easy;

//https://leetcode.com/problems/ugly-number/description/
public class UglyNumber {

    public static void main(String args[]){

       /* Input: n = 6
        Output: true
        Explanation: 6 = 2 × 3*/
        System.out.println(isUgly(6));

      /*  Input: n = 1
        Output: true
        Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.*/
        System.out.println(isUgly(1));

       /* Input: n = 14
        Output: false
        Explanation: 14 is not ugly since it includes the prime factor 7.*/
        System.out.println(isUgly(14));
    }

    //T: O(log(N))
    //S: O(1)
    public static boolean isUgly(int n) {
        // A non-positive integer cannot be ugly
        if (n <= 0) {
            return false;
        }

        // Factorize by dividing with permitted factors
        for (int factor : new int[] { 2, 3, 5 }) {
            n = keepDividingWhenDivisible(n, factor);
        }

        // Check if the integer is reduced to 1 or not.
        return n == 1;
    }

    // Keep dividing dividend by divisor when division is possible.
    private static int keepDividingWhenDivisible(int dividend, int divisor) {
        while (dividend % divisor == 0) {
            dividend /= divisor;
        }
        return dividend;
    }

}
