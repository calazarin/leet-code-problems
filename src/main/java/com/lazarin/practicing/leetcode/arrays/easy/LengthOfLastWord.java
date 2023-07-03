package com.lazarin.practicing.leetcode.arrays.easy;

//http://leetcode.com/problems/length-of-last-word
public class LengthOfLastWord {

    public static void main(String args[]){
        /*Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.*/
        System.out.println(lengthOfLastWord("Hello World"));

       /* Input: s = "   fly me   to   the moon  "
        Output: 4
        Explanation: The last word is "moon" with length 4.*/
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

      /*  Input: s = "luffy is still joyboy"
        Output: 6
        Explanation: The last word is "joyboy" with length 6.*/
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    //T:O(N)
    //S:O(N)
    public static int lengthOfLastWord(String s){
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
