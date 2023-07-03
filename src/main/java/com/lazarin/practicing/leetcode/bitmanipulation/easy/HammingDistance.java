package com.lazarin.practicing.leetcode.bitmanipulation.easy;

//https://leetcode.com/problems/hamming-distance/description/
public class HammingDistance {

    public static void main(String args[]){

        HammingDistance hd = new HammingDistance();
        /*Input: x = 1, y = 4
        Output: 2
        Explanation:
        1   (0 0 0 1)
        4   (0 1 0 0)
               ↑   ↑
        The above arrows point to positions where the corresponding bits are different.*/
        System.out.println(hd.hammingDistance(1, 4));
        System.out.println(hd.hammingDistance2(1, 4));

        /*
        Input: x = 3, y = 1
        Output: 1*/
        System.out.println(hd.hammingDistance(3, 1));
        System.out.println(hd.hammingDistance2(3, 1));
    }

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
