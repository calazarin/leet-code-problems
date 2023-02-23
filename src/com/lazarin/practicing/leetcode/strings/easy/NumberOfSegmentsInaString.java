package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/number-of-segments-in-a-string
public class NumberOfSegmentsInaString {

    public static void main(String args[]){

        NumberOfSegmentsInaString n = new NumberOfSegmentsInaString();

      /*  Input: s = "Hello, my name is John"
        Output: 5
        Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]*/
        System.out.println(n.countSegments("Hello, my name is John"));
        System.out.println(n.countSegments2("Hello, my name is John"));

        /*Input: s = "Hello"
        Output: 1*/
        System.out.println(n.countSegments("Hello"));
        System.out.println(n.countSegments2("Hello"));
    }

    //approach 1 - built-in functions
    //T: O(N)
    //S: O(N)
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    //approach 2 - no extra space needed
    //T: O(N)
    //S: O(1)
    public int countSegments2(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}
