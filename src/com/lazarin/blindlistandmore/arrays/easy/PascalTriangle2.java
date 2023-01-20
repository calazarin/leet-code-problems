package com.lazarin.blindlistandmore.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle-ii/description/
public class PascalTriangle2 {

    public static void main(String args[]) {

    }

    //amount of elements in a row:
    //row index + 1
    //row: 0; amount: 1
    //row: 1; amount: 2
    //row: 2; amount: 3
    //row: 3; amount: 4
    //row: 4; amount: 5

    //1 => row: 0; amount 1
    //1-1 => row: 1; amount: 2
    // 1-2-1 => row: 2;  amount: 3
    // 1-3-3-1 =>  row: 3; amount: 4
    //1-4-6-4-1 => row: 4; amount: 5
    // 1-5-10-10-5-1 => row: 5; amount 6
    //1-6-15-20-15-6-1=> row: 6; amount 7

    public List<Integer> getRow(int rowIndex) {

        //rowIndex = 3
        //i =053; x = 0 ; j = 3
        //t=[[1], [1, 1], [1,2,1], [1,3,3,1] ]
        List<List<Integer>> t = new ArrayList<>();

        int i = 0;
        while (i <= 1) {
            t.add(new ArrayList());
            if (i == 0) {
                t.get(i).add(1);
            } else if (i == 1) {
                t.get(i).add(1);
                t.get(i).add(1);
            }
            i++;
        }

        for (int x = i; x <= rowIndex; x++) {
            t.add(new ArrayList());
            int j = 0;
            while (j <= x) {
                if (j == 0 || j == x) {
                    t.get(x).add(1);
                } else {
                    var prevR = t.get(x - 1);
                    t.get(x).add(prevR.get(j - 1) + prevR.get(j));
                }
                j++;
            }
        }
        return t.get(rowIndex);
    }

    public List<Integer> getRow2(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(prev.get(j - 1) + prev.get(j));
                }

            }
            prev = temp;
        }
        return prev;
    }

}
