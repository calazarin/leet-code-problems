package com.lazarin.blindlistandmore.arrays.easy;

//http://leetcode.com/problems/length-of-last-word
public class LengthOfLastWord {

    public static void main(){
        /*Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.*/

       /* Input: s = "   fly me   to   the moon  "
        Output: 4
        Explanation: The last word is "moon" with length 4.*/

      /*  Input: s = "luffy is still joyboy"
        Output: 6
        Explanation: The last word is "joyboy" with length 6.*/
    }

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
