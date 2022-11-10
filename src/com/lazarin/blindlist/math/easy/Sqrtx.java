package com.lazarin.blindlist.math.easy;

//https://leetcode.com/problems/sqrtx/
public class Sqrtx {

    public static void main(String args[]){

       /* Input: x = 4
        Output: 2
        Explanation: The square root of 4 is 2, so we return 2.*/
        System.out.println(mySqrt(4));
        System.out.println(mySqrt2(4));
        System.out.println(mySqrt3(4));

        /*Input: x = 8
        Output: 2
        Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.*/
        System.out.println(mySqrt(8));
        System.out.println(mySqrt2(8));
        System.out.println(mySqrt3(8));
    }

    public static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static int mySqrt2(int x) {
        return (int) Math.pow(x, 0.5);
    }

    //using binary search
    //T: O (logN)
    public static int mySqrt3(int x) {
        if (x < 2) return x;

        long num;
        int pivot, left = 2, right = x / 2;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            num = (long)pivot * pivot;
            if (num > x) {
                right = pivot - 1;
            } else if (num < x) {
                left = pivot + 1;
            } else {
                return pivot;
            }
        }

        return right;
    }
}
