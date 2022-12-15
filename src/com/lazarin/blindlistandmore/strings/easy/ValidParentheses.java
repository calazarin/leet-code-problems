package com.lazarin.blindlistandmore.strings.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String args[]){

        //s = "()" => True
        System.out.println(isValid("()"));
        //s = "()[]{}" => True
        System.out.println(isValid("()[]{}"));
        //s = "(]" => False
        System.out.println(isValid("(]"));
        //s = "([)]" => False
        System.out.println(isValid("([)]"));

    }

    public static boolean isValid(String s) {

        if(s.length() <= 1) return false;

        char[] allCharacters = s.toCharArray();

        HashMap<Character, Character> openToCloseMap = new HashMap<>();
        openToCloseMap.put(')','(');
        openToCloseMap.put(']','[');
        openToCloseMap.put('}','{');

        Stack<Character> stack = new Stack<>();

        for(char c : allCharacters){

            if(openToCloseMap.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == openToCloseMap.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }

        }

        return stack.isEmpty() ? true : false;
    }
}
