package com.lazarin.practicing.leetcode.strings.medium;

//https://leetcode.com/problems/count-and-say/
public class CountAndSay {

    public static void main(String args[]){

        CountAndSay countAndSay = new CountAndSay();

       /* Input: n = 1
        Output: "1"
        Explanation: This is the base case.*/
        System.out.println(countAndSay.countAndSay(1));

      /*  Input: n = 4
        Output: "1211"
        Explanation:
        countAndSay(1) = "1"
        countAndSay(2) = say "1" = one 1 = "11"
        countAndSay(3) = say "11" = two 1's = "21"
        countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"*/
        System.out.println(countAndSay.countAndSay(4));
    }


    //currString = "1"
    //i = 2
    //n = 4
    //nextString = "2"
    //j = 0
    //k = 1

    //approach 1
    //T: O(4^n/3)
    public String countAndSay(int n) {
        String currentString = "1";
        for (int i = 2; i <= n; i++) {
            String nextString = "";
            for (int j = 0, k = 0; j < currentString.length(); j = k) {
                while (k < currentString.length() && currentString.charAt(k) == currentString.charAt(j)){
                    k++;
                }
                nextString += Integer.toString(k - j) + currentString.charAt(j);
            }
            currentString = nextString;
        }
        return currentString;
    }

    private String count(int n){
        if(n == 1){
            return "1";
        }
        return count(n - 1);
    }
}
