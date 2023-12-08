package com.lazarin.practicing.leetcode.strings.medium;

//https://leetcode.com/problems/string-compression
public class StringCompression {

    //T: O(N)
    //S: O(1)
    public int compress(char[] chars) {

        int i = 0, res = 0;
        while(i < chars.length){

            int groupLength = 1;
            while(i + groupLength < chars.length && chars[i + groupLength] == chars[i]){
                groupLength++;
            }

            chars[res++] = chars[i];
            if(groupLength > 1){
                String glStr = Integer.toString(groupLength);
                for(char c : glStr.toCharArray()){
                    chars[res++] = c;
                }
            }
            i += groupLength;
        }
        return res;
    }
}
