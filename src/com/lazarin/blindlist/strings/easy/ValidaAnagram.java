package com.lazarin.blindlist.strings.easy;

public class ValidaAnagram {
    public static void main(String args[]){

        // s = "anagram", t = "nagaram" => TRUE
        var resp = isAnagram("anagram", "nagaram");
        System.out.println(resp);

        // s = "rat", t = "car" => FALSE
        var resp2 = isAnagram("rat", "car");
        System.out.println(resp2);

    }

    //T: O(n)
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] charCounter = new int[128];

        for(int i = 0; i < s.length(); i++){
            charCounter[s.charAt(i)]++;
        }

        for(int i = 0; i < t.length(); i++){
            charCounter[t.charAt(i)]--;
            if(charCounter[t.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }
}
