package com.lazarin.blindlistandmore.binarysearch.easy;

//https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessNumberHigherOrLower extends GuessGame{

    public static void main(String args[]){

       /* Input: n = 10, pick = 6
        Output: 6*/

       /* Input: n = 1, pick = 1
        Output: 1*/

        /*Input: n = 2, pick = 1
        Output: 1*/

    }

    //my attempt - using binary search
    //T: O(logn)
    //S:O(1)
    public int guessNumber(int n) {

        int left = 1;
        int right = n;

        while(left <= right){

            int mid = left + (right - left) /2;
            var res = guess(mid);

            if(res == 0){
                return mid;
            } else if(res < 0){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    //approach 2 - brute force
    //T:O(N)
    //S:O(1)
    public int guessNumber2(int n) {

        for (int i = 1; i < n; i++)
            if (guess(i) == 0)
                return i;
        return n;

    }
}
