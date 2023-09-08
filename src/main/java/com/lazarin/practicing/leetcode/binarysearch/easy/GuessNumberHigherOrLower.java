package com.lazarin.practicing.leetcode.binarysearch.easy;

//https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessNumberHigherOrLower extends GuessGame{

    //my attempt - using binary search
    //T: O(logn)
    //S:O(1)
    public int guessNumber(int n) {

        int left = 1;
        int right = n;

        while(left <= right){

            int mid = left + (right - left) /2; //this avoids integer overflow https://stackoverflow.com/questions/6735259/calculating-mid-in-binary-search/57703680#57703680
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
