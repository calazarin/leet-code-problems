package com.lazarin.practicing.leetcode.arrays.easy;

//http://leetcode.com/problems/length-of-last-word
public class LengthOfLastWord {

    //T:O(N)
    //S:O(N)
    public int lengthOfLastWord(String s){
        char[] inputArr = s.toCharArray();
        int counter = 0;
        boolean isCharacter = false;

        for(int i = inputArr.length - 1; i >= 0; i--){

            if(inputArr[i] != ' ' && !isCharacter){
                isCharacter = true;
            }
            if(isCharacter && inputArr[i] != ' '){
                counter++;
            } else if(isCharacter && inputArr[i] == ' ') {
                break;
            }

        }

        return counter;
    }

}
