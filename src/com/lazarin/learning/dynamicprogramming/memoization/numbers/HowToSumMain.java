package com.lazarin.learning.dynamicprogramming.memoization.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowToSumMain {

    public static void main(String args[]){

        var result1 = howToSum(7, new int[]{2,3});
        System.out.println(Arrays.toString(result1.toArray()));
        var result2 = howToSum(7, new int[]{5, 3, 4, 7});
        System.out.println(Arrays.toString(result2.toArray()));
        var result3 = howToSum(8, new int[]{2,3,5});
        System.out.println(Arrays.toString(result3.toArray()));
        var result4 = howToSum(300, new int[]{3, 14});
        System.out.println(Arrays.toString(result4.toArray()));
    }

    private static List<Integer> howToSum(int targetSum, int[] numbers) {

        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (int number : numbers) {

            var remainder = targetSum - number;
            var remainderResult = howToSum(remainder, numbers);
            if (remainderResult != null) {
                var newResult = new ArrayList<Integer>();
                newResult.add(number);
                newResult.addAll(remainderResult);
                return newResult;
            }
        }
        return null;
    }
}
