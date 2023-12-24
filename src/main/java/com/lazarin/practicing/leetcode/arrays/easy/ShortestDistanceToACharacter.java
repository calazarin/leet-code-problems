package com.lazarin.practicing.leetcode.arrays.easy;

//https://leetcode.com/problems/shortest-distance-to-a-character/
public class ShortestDistanceToACharacter {

    //approach 1 - two pointers (prev and next)
    //T: O(N)
    //S: O(N) for result array
    //
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] answer = new int[n];

        //find the first ocurrenc of c
        int next = moveForward(s, c, 0);
        int prev = next;

        for(int i = 0; i < n; i++){
            if(i > next) {
                prev = next;
                next = moveForward(s, c, next + 1);
            }
            answer[i] = Math.abs(Math.min(next - i, i - prev));
        }

        return answer;
    }

    private int moveForward(String s, char c, int position) {
        while(position < s.length()) {
            if(s.charAt(position) == c){
                break;
            }
            position++;
        }
        if(position == s.length()) {
            return Integer.MAX_VALUE;
        }
        return position;
    }

    //approach 2 - check the nearest c from both sides
    public int[] shortestToChar_2(String s, char c) {

        int n = s.length();
        int[] answer = new int[n];
        int prev = n;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == c) {
                prev = 0;
                answer[i] = 0;
            } else {
                answer[i] = ++prev;
            }
        }

        prev = n;
        for(int i = n - 1; i >=0; i--){
           if(s.charAt(i) == c){
               prev = 0;
               answer[i] = Math.min(answer[i], 0);
           } else {
               answer[i] = Math.min(answer[i], ++prev);
           }
        }

        return answer;
    }
}
