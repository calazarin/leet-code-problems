package com.lazarin.practicing.leetcode.strings.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-palindrome/
public class LongestPalindrome {

    //approach 1
    //T: O(N)
    //S: O(N)
    public int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int p_length = 0;
        boolean one_char = false;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            var c_counter = entry.getValue();
            if(c_counter % 2 == 0){
                p_length += c_counter;
            } else {
                one_char = true;
                p_length += c_counter - 1;
            }

        }
        return one_char ? p_length + 1 : p_length;
    }

    //approach 2
    //T:O(N)
    //S:O(N)
    public int longestPalindrome_2(String s) {
        int[] char_counter = new int[128];//asc letters
        for(Character c : s.toCharArray()){
            char_counter[c]++;
        }

        int result =0;
        for(Integer counter : char_counter){
            result += counter / 2 * 2;
            if(result % 2 == 0 && counter % 2 == 1 ){
                result += 1;
            }
        }
        return result;
    }

}
