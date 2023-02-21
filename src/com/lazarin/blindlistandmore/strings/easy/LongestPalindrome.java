package com.lazarin.blindlistandmore.strings.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-palindrome/
public class LongestPalindrome {

    public static void main(String args[]){
        LongestPalindrome lp = new LongestPalindrome();
        /*
        Input: s = "abccccdd"
        Output: 7
        Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.*/
        System.out.println(lp.longestPalindrome("abccccdd"));
        System.out.println(lp.longestPalindrome2("abccccdd"));

       /* Input: s = "a"
        Output: 1
        Explanation: The longest palindrome that can be built is "a", whose length is 1.*/
        System.out.println(lp.longestPalindrome("a"));
        System.out.println(lp.longestPalindrome2("a"));
    }

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
    public int longestPalindrome2(String s) {
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
