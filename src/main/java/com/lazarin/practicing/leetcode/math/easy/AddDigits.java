package com.lazarin.practicing.leetcode.math.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/add-digits/
public class AddDigits {

    public static void main(String args[]){
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits3(100));
    }

    public int addDigits(int num) {
        if(num == 0) return num;
        return checkSumDigits(num);
    }

    //num = 100
    //digits = []
    //sum = 2
    private int checkSumDigits(int num){
        List<Integer> digits = new ArrayList();
        splitDigits(num, digits);
        int sum = 0;
        for(Integer d : digits){
            if( d > 0){
                sum = sum + d;
            }
        }
        if(String.valueOf(sum).length() > 1){
            sum = checkSumDigits(sum);
        }
        return sum;
    }

    //digits = [0,0,1]
    //num: 100
    //a: 0
    //b: 1
    private void splitDigits(int num, List<Integer> digits){
        int a = num % 10;
        int b = num / 10;
        digits.add(a);
        if(String.valueOf(b).length() > 1){
            splitDigits(b, digits);
        } else {
            digits.add(b);
        }
    }

    //approach 2 - constant time! O(1)
    //digit root math theory
    //https://youtu.be/YJpVLSgLe0w
    public int addDigits2(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }

    //approach 3
    //T: O(N)
    //S: O(1)
    public int addDigits3(int num){
        int sum = 0;
        while(num >= 10){
            sum += num % 10;
            num = num / 10;
            if( num < 10){
                num += sum;
                sum = 0;
            }
        }
        return num;
    }

    public int addDigits3_1(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum+=rem;
            num = num /10;
        }
        return sum;
    }
}
