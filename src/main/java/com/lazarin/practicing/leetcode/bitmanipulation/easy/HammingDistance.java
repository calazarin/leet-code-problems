package com.lazarin.practicing.leetcode.bitmanipulation.easy;

//https://leetcode.com/problems/hamming-distance/description/
public class HammingDistance {

    //approach - using XOR
    public int hammingDistance(int x, int y) {
        int result = 0;
        while(x > 0 || y > 0){
            //if the number is odd, the last binary digit is 1
            //if the number is even, the last binary digit is 0
            result += (x % 2) ^ (y % 2);
            //shift 1 bit to right both numbers
            x >>= 1;
            y >>= 1;
        }
        return result;
    }

    //solving a little different
    public int hammingDistance2(int x, int y) {
        int result = x^y; //takes only different bits between x and y
        int count = 0;
        while(result > 0){
            count+= result & 1; //count 1s
            result >>= 1;
        }
        return count;
    }
}
