package com.lazarin.learning.leetcode.binary.practing;

//Given a number, find the number of 1s in the binary representation of a number
public class FindTheNumberOf1s {

    public static int ones(int x){
        int sum = 0;
        while(x > 0){
            //with bitwise AND with 1; when both are 1, then we have 1
            sum+= x & 1;
            x >>= 1;
        }
        return sum;
    }

}
