package com.lazarin.blindlistandmore.math.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public static void main(String args[]){
      /*  Input: n = 19
        Output: true
        Explanation:
        12 + 92 = 82
        82 + 22 = 68
        62 + 82 = 100
        12 + 02 + 02 = 1*/
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(19));

      /*  Input: n = 2
        Output: false*/
    }

    //S: O(N)
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }


    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            totalSum += d * d; //square the digit
            n = n / 10; //next digiit
        }
        return totalSum;
    }
}
