package com.lazarin.blindlistandmore.math.easy;

//https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheetColumnTitle {

    public static void main(String args[]){

        /*Input: columnNumber = 1
        Output: "A"*/
     //   System.out.println(convertToTitle(1));

       /* Input: columnNumber = 28
        Output: "AB"*/
        //System.out.println(convertToTitle(28));

       /* Input: columnNumber = 701
        Output: "ZY"*/
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int curr = columnNumber % 26;
            columnNumber /= 26;
            sb.append((char)(curr+'A'));
        }
        return sb.reverse().toString();
    }
}
