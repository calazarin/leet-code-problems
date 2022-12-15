package com.lazarin.blindlistandmore.binary;

public class ReverseBits {

    public static void main(String args[]){

    }

    public int reverseBits(int n) {
        var result = 0;
        for(int i = 0; i < 32; i++){
            var mostRight = n & 1; //get the most significant bit on the right of n
            n = n >> 1; //shift n digits to right as we already took the most significant one on that position
            result = result << 1; //shift result bit to right
            result = result | mostRight; // then apply an OR logical over result and most sifnicant
        }
        return result;
    }
}
