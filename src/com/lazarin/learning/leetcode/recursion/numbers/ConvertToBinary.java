package com.lazarin.learning.leetcode.recursion.numbers;

public class ConvertToBinary {


    public static void main(String args[]){
        var binary = convertToBinary(233);
        System.out.println(binary);
    }

    public static String convertToBinary(int number){
        if(number == 0){
            return "";
        }
        var binaryDigit = number % 2;
        return convertToBinary(number / 2) + binaryDigit;
    }

}
