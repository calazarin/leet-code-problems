package com.lazarin.practicing.leetcode.google.frequentquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class EvaluateReversePolishNotation {

    public static void main(String args[]){
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> numsStack = new Stack<>();

        List<String> operators = Arrays.asList("+","*","-","/");

        for(String token : tokens){
            if(!operators.contains(token)){
                numsStack.add(Integer.valueOf(token));
                continue;
            }
            var num2 =numsStack.pop();
            var num1 = numsStack.pop();
            //translate string to operator
            var result = 0;

            switch(token){
                case "+":
                    result = num2 + num1;
                    break;
                case "-":
                    result = num2 - num1;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "*":
                    result = num2 * num1;
                    break;
            }
            numsStack.push(result);
        }
        return numsStack.pop();
    }
}
