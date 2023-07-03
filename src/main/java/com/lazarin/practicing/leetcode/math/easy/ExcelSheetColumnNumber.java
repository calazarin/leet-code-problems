package com.lazarin.practicing.leetcode.math.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/excel-sheet-column-number/
public class ExcelSheetColumnNumber {

    public static void main(String args[]){

    }

    //To get the indices of alphabets, create a mapping of alphabets and their corresponding values
    //Initialize an accumulator variable result
    //Starting from right to left, calculate the value of the character associated with its position and add it to result
    //T: O(N) where N is the number of characters in the input string
    //S: O(1) even though we have an alphabet to index mapping,it is always constant
    public int titleToNumber(String columnTitle) {

        int result = 0;
        Map<Character,Integer> alpha_map = new HashMap<>();
        for(int i  = 0; i < 26; i++){
            int c = i + 65; //Decimal 65 in ASCII corresponds to char 'A'
            alpha_map.put((char)c, i + 1);
        }

        int n = columnTitle.length();
        for(int i = 0; i < n; i++){
            char cur_char = columnTitle.charAt(n - 1 - i);
            result += (alpha_map.get(cur_char) * (Math.pow(26, i)));
        }
        return result;
    }

    //approach 2
    //note:  There is another way to get the number value of a character without building an alphabet mapping.
    // You can do this by converting a character to its ASCII value and subtracting ASCII value of character 'A' from that value.
    // By doing so, you will get results from 0 (for A) to 25 (for Z). Since we are indexing from 1, we can just add 1 up to the result.
    // This eliminates a loop where you create an alphabet to number mapping which was done in Approach 1.7
    //T: O(N) - N is the the number of characters in the input string
    //S: O(1)
    public int titleToNumber2(String columnTitle){
        int result = 0;
        int n = columnTitle.length();
        for(int i = 0; i < n; i++){
            result = result * 26;
            //In Java, subtracting character is subtracting ASCII values of characters
            result += (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
