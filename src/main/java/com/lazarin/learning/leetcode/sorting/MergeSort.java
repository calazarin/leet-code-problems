package com.lazarin.learning.leetcode.sorting;

public class MergeSort {

    public void mergeSort(int[] numbers){
        split(numbers);
    }

    private void split(int[] numbers){

        if(numbers.length < 2){
            return;
        }

        int middleIndex = numbers.length / 2;

        int[] leftSide = new int[middleIndex];
        for(int i = 0; i < leftSide.length; i++){
            leftSide[i] = numbers[i];
        }

        int[] rightSide = new int[numbers.length - middleIndex];
        for(int j = 0; j < rightSide.length; j++){
            int numbersIndex = middleIndex + j;
            rightSide[j] = numbers[numbersIndex];
        }

        split(leftSide);
        split(rightSide);

        //merge
        merge(numbers, leftSide, rightSide);
    }

    private void merge(int[] inputArray, int[] leftSide, int[] rightSide){

        int i = 0, j = 0, k = 0;
        while(i < leftSide.length && j < rightSide.length){

            if(leftSide[i] <= rightSide[j]){
                inputArray[k] = leftSide[i];
                i++;
            } else {
                inputArray[k] = rightSide[j];
                j++;
            }
            k++;
        }

        while(j < rightSide.length){
            inputArray[k] = rightSide[j];
            j++;
            k++;
        }

        while(i < leftSide.length){
            inputArray[k] = leftSide[i];
            i++;
            k++;
        }
    }
}
