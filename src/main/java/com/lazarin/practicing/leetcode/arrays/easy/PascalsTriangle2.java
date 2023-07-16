package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle-ii/description/
public class PascalsTriangle2 {

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
