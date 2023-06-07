package com.lazarin.practicing.leetcode.strings.medium;

//https://leetcode.com/problems/string-compression
public class StringCompression {

    public static void main(String args[]){

        StringCompression solution = new StringCompression();

        /* Input: chars = ["a","a","b","b","c","c","c"]
        Output: Return 6, and the first 6 characters of the input array
        should be: ["a","2","b","2","c","3"]*/
        System.out.println(solution.compress(new char[]{'a','a','b','b','c','c','c'}));

        /*  Input: chars = ["a"]
        Output: Return 1, and the first character of the input array should be: ["a"]*/
        System.out.println(solution.compress(new char[]{'a'}));

       /* ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        Output: Return 4, and the first 4 characters of the
        input array should be: ["a","b","1","2"].*/
        System.out.println(solution.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));

    }

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
