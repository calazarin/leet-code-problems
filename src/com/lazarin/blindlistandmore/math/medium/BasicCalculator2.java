package com.lazarin.blindlistandmore.math.medium;

import java.util.Stack;

public class BasicCalculator2 {

    //https://leetcode.com/problems/basic-calculator-ii/description/
    public static void main(String args[]){
     /*   Input: s = "36+2*2"
        Output: 7*/
        System.out.println(new BasicCalculator2().calculate("36+2*2"));

     /*   Input: s = " 3/2 "
        Output: 1*/

      /*  Input: s = " 3+5 / 2 "
        Output: 5*/
    }

    //approach 1 - using stack
    //T: O(N) where N is the lenght of the string7
    //S: O(N)

    //Input: s = "3+2*2"
    public int calculate(String s) {

        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();

        int currentNumber = 0;
        char operation = '+';

        for (int i = 0; i < len; i++) {

            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                var partial = currentNumber * 10;
                var subpartial = currentChar - '0';
                currentNumber = partial + subpartial;
            }

            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {

                if (operation == '-') {
                    stack.push(-currentNumber);
                }

                else if (operation == '+') {
                    stack.push(currentNumber);
                }

                else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                }

                else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }

                operation = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
