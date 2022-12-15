package com.lazarin.blindlistandmore.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {

    public static void main(String args[]){

        /*Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]*/
        var resp = generate(5);
        print(resp);

       /* Input: numRows = 1
        Output: [[1]]*/
        var resp2 = generate(1);
        print(resp2);
    }

    //l = 0
    //r = 1
    //i = 4;
    //i - 2 = 2
    //row = 2
    //j = 1

    public static List<List<Integer>> generate(int numRows) {
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

    public static void print(List<List<Integer>> toBePrinted){
        for(int i = 0 ; i < toBePrinted.size(); i++){
            toBePrinted.get(i).stream().forEach(x -> System.out.print(x+" - "));
            System.out.print("\n");
        }
    }

    //T: O(numsRows^2)
    //S: O(1) output does not count as memory sage
    public static List<List<Integer>> generate2(int numRows) {

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
