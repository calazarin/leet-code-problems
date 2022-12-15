package com.lazarin.blindlistandmore.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/palindrome-partitioning/
public class PalindromePartitioning {


    public static void main(String args[]){

       /* Input: s = "aab"
        Output: [["a","a","b"],["aa","b"]]*/
        var resp = partition("aab");
        print(resp);

      /*  Input: s = "a"
        Output: [["a"]]*/
        var resp2 = partition("a");
        print(resp2);
    }

    public static void print(List<List<String>> toBePrinted){
        for(int i = 0 ; i < toBePrinted.size(); i++){
            toBePrinted.get(i).stream().forEach(x -> System.out.print(x+" - "));
            System.out.print("\n");
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> resp = new ArrayList<>();
        dfs(0, s, resp, new ArrayList<>());
        return resp;
    }

    private static void dfs(int i, String s, List<List<String>> resp, List<String> temp){
        if(i >= s.length()){
             resp.add(new ArrayList<>(temp));
             return;
        }
        for(int j = i; j < s.length(); j++){
            if(isPalindrome(s, i, j)){
                temp.add(s.substring(i, j+1));
                dfs(j + 1, s, resp, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
