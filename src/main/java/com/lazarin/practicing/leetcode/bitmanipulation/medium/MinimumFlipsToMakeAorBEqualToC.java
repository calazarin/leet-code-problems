package com.lazarin.practicing.leetcode.bitmanipulation.medium;

//https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c
public class MinimumFlipsToMakeAorBEqualToC {

    //T: O(n) where N is the amount of bits in an integer number
    //S: O(1)
    public int minFlips(int a, int b, int c) {

        int flip_count = 0;
        if((a | b) == c) {
            return 0;
        }

        //T: O(n) where N is the amount of bits in an integer number
        for(int i = 32; i > 0; i--) {

            int a_bit = (a >> i) & 1;
            int b_bit = (b >> i) & 1;
            int c_bit = (c >> i) & 1;

            //compare the right most bit with c; if different, flipping is required
            if((a_bit | b_bit) != c_bit){
                if(c_bit == 0) {
                    flip_count += b_bit + a_bit; //both needs to be zero; then count necessary flips
                } else {
                    flip_count++;
                }
            }
        }
        return flip_count;
    }

}
