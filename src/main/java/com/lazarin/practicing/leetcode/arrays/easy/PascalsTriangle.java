package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalT = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(j > 0 && j < i - 1){
                    List<Integer> aboveRow = pascalT.get(i - 2);
                    int l = row.size() - 1, r = l + 1;
                    while(r <= j){
                        row.add(aboveRow.get(l) + aboveRow.get(r));
                        l++;
                        r++;
                    }
                } else {
                    row.add(1);
                }
            }
            pascalT.add(row);
        }
        return pascalT;
    }

    public void print(List<List<Integer>> toBePrinted){
        for(int i = 0 ; i < toBePrinted.size(); i++){
            toBePrinted.get(i).stream().forEach(x -> System.out.print(x+" - "));
            System.out.print("\n");
        }
    }

    //T: O(numsRows^2)
    //S: O(1) output does not count as memory sage
    public List<List<Integer>> generate2(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rowNum = 1; rowNum < numRows; rowNum++){

            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = triangle.get(rowNum - 1);
            currentRow.add(1);
            for(int col = 1; col < previousRow.size(); col++){
                currentRow.add(previousRow.get(col - 1) + previousRow.get(col));
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;

    }
}
