package com.lazarin.learning.leetcode.recursion.string;

public class ReverseString {

    public static void main(String args[]){
        var result = reverseString("CARLOS");
        System.out.println(result);
    }

    public static String reverseString(String input){

        //defining a base case
        if(input.length() == 0) return "";

        return reverseString(input.substring(1)) + input.charAt(0);

    }

}
