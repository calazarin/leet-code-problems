package com.lazarin.learning.leetcode.sorting.practice;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {

    public static void main(String args[]) {

        Random random = new Random();

        int[] input = new int[15];
        for (int i = 0; i < 15; i++) {
            input[i] = random.nextInt(100);
        }
        mergeSort(input);
        System.out.println(Arrays.toString(input));
    }

    private static void mergeSort(int[] input) {

        if(input.length < 2){
            return;
        }

        var midIndex = input.length / 2;

        int[] leftSideArr = new int[midIndex];
        for(int i = 0; i < leftSideArr.length; i++){
            leftSideArr[i] = input[i];
        }

        int[] rightSideArr = new int[input.length - midIndex];
        for(int i = 0; i < rightSideArr.length; i++){
            rightSideArr[i] = input[midIndex + i];
        }

        //sort left
        mergeSort(leftSideArr);
        //sort right
        mergeSort(rightSideArr);
        //merge them
        merge(input, leftSideArr, rightSideArr);
    }

    private static void merge(int[] input, int[] leftSide, int[] rightSide) {

        //1st. create 3 pointers to handle left, right and input
        int leftIndex = 0, rightIndex = 0, inputIndex = 0;

        while(leftIndex < leftSide.length && rightIndex < rightSide.length){

            if(leftSide[leftIndex] < rightSide[rightIndex]){
                input[inputIndex] = leftSide[leftIndex];
                leftIndex++;
            } else {
                input[inputIndex] = rightSide[rightIndex];
                rightIndex++;
            }
            inputIndex++;
        }
        //2nd. populate remaining items in each side
        while(leftIndex < leftSide.length){
            input[inputIndex] = leftSide[leftIndex];
            leftIndex++;
            inputIndex++;
        }

        while(rightIndex < rightSide.length){
            input[inputIndex] = rightSide[rightIndex];
            rightIndex++;
            inputIndex++;
        }
    }
}
