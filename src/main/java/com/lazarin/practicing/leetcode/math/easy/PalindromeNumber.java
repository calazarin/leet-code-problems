package com.lazarin.practicing.leetcode.math.easy;

//https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {

    public static void main(String args[]){

       /* Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.*/

       /* Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
         Therefore it is not a palindrome.*/

    }

    //it is palindrome:
    // - the same from left to right; right to left
    // - not negative number

    //approach 1: compare as string
    //take the number and convert it to String
    //with String I can compare the positions one by one
    //if first position negative sign, return false; else continue comparting
    //T: O(N/2) where N is the lenght of String - I need compare until the middle only

    //approach 2: compare with numbers only
    //divide by 10 until result == 0 -> result next number
    //mod % 10 -> current number
    //store all numbers in a array
    //compare them

    //O(n/10) = ON
    //O(N)
    public boolean isPalindrome(int x) {

        String nString = String.valueOf(x);
        if(nString.charAt(0) == '-'){
            return false;
        }

        if(nString.length() == 1){
            return true;
        }

        int i = 0, j = nString.length() - 1;
        while(i < j){
            if(nString.charAt(i) != nString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
