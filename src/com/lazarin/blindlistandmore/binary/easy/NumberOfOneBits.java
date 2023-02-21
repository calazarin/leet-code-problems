package com.lazarin.blindlistandmore.binary.easy;

//https://leetcode.com/problems/number-of-1-bits/
public class NumberOfOneBits {

    public static void main(String args[]){
        //integer n = 11
        // n = 00000000000000000000000000001011
        //output = 3
        System.out.println(hammingWeight(00000000000000000000000000001011));

        //integer n = 128
        //n = 00000000000000000000000010000000
        //output = 1
        System.out.println(hammingWeight(00000000000000000000000010000000));

        //integer n = -3
        // n = 11111111111111111111111111111101
        // output = 31
      //  System.out.println(hammingWeight(00000000000000000000000010000000));

    }

    //fliping the most significant bit
    public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n = n& (n -1);
            count++;
        }
        return count;
    }
}
