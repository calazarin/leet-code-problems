package com.lazarin.practicing.leetcode.strings.easy;

import java.util.Arrays;

//https://leetcode.com/problems/isomorphic-strings/description/
public class IsomorphicStrings {

    public static void main(String args[]){
       /* Input: s = "egg", t = "add"
        Output: true*/
        System.out.println(isIsomorphic("egg","add"));
      /*  Input: s = "foo", t = "bar"
        Output: false*/

        /*Input: s = "paper", t = "title"
        Output: true*/
    }

    //T: O(N) where N is the amount of letters on both strings
    //S: O(1) as both mappings have fixed size0,

    public static boolean isIsomorphic(String s, String t) {

        int[] s_to_t = new int[256]; //ASCII characters
        int[] t_to_s = new int[256];
        Arrays.fill(s_to_t, -1);
        Arrays.fill(t_to_s, -1);

        for(int i = 0; i < s.length(); i++){

            var s_c = s.charAt(i);
            var t_c = t.charAt(i);

            if(s_to_t[s_c] == -1 && t_to_s[t_c] == -1){
                s_to_t[s_c] = t_c;
                t_to_s[t_c] = s_c;
            } else if(!(s_to_t[s_c] == t_c && t_to_s[t_c] == s_c)){
                return false;
            }

        }
        return true;
    }
}
