package com.lazarin.learning.recursion.numbers;

public class SumOfNaturalNumbers {
    public static void main(String args[]){
        var result = sumOfNumbers(10);
        System.out.println(result);
    }

    public static int sumOfNumbers(int inputNumber){
        //base case
        if(inputNumber <= 1) return inputNumber;
        return inputNumber + sumOfNumbers(inputNumber - 1);
    }
}
