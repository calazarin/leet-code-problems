package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/add-strings/
//Facebook | Easy | String
public class AddStrings {

    public static void main(String args[]){
        AddStrings ads = new AddStrings();
        /*
        Input: num1 = "11", num2 = "123"
        Output: "134"
        */
        System.out.println(ads.addStrings("11", "123"));

       /* Input: num1 = "456", num2 = "77"
        Output: "533"*/
        System.out.println(ads.addStrings("456", "77"));

       /* Input: num1 = "0", num2 = "0"
        Output: "0"*/
        System.out.println(ads.addStrings("0", "0"));
    }

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
