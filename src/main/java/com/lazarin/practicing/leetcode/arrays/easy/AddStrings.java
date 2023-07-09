package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/add-strings/
//Facebook | Easy | String
public class AddStrings {

    //T: O(m+n)
    //S: O(m+n)
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

        StringBuilder result = new StringBuilder();
        while(i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0){
                //converts to as and gets the int value
                sum += num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += num2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 10);
            carry = sum / 10;
        }
        if(carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();

    }

}
