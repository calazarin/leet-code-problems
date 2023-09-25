package com.lazarin.learning.leetcode.bitmanipulation;

//Given a number, find the number of 1s in the binary representation of a number
public class FindTheNumberOf1s {

    //https://youtu.be/8iWIpkFgZ64
    public static void main(String args[]){

        //eg.
        //ones(2) = 1
        //ones(3) = 2
        //ones(5) = 2
        //ones(7) = 3

        //solution:
        //look to the lowest bit and shift the number to right
        //T: O(log(x)) where x is the number of bits to represent a number

        System.out.println(ones(2));
        System.out.println(ones(3));
        System.out.println(ones(5));
        System.out.println(ones(7));
    }

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
