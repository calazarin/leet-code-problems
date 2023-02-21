package com.lazarin.learning.binary.practing;

public class ConvertNumToBase7 {

    public static void main(String args[]){

        ConvertNumToBase7 convertNumToBase7 = new ConvertNumToBase7();
        System.out.println(convertNumToBase7.toBase7(100));

        System.out.println(convertNumToBase7.toBase7(-7));

    }

    //if num == 0; resp == 0
    //if num > 0; divide num by 7 repeatedly until reaches 0 and record reminder each time
    //if num < 0; the num representation will also be negative; so first converts, then add the sign
    public String toBase7(int num) {

        if (num == 0) return "0";

        String sign = "";
        if (num < 0){
            num = num * (-1);
            sign = "-";
        }
        StringBuilder builder = new StringBuilder();

        while (num != 0) {
            builder.append(num % 7);
            num = num / 7;
        }

        return sign + builder.reverse();
    }

    private String reverse(String input){
        if(input.length() == 1) return input;
        return reverse(input.substring(1)) + input.charAt(0);
    }

}
