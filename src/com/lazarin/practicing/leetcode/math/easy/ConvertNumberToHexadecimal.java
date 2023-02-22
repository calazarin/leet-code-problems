package com.lazarin.practicing.leetcode.math.easy;

//https://leetcode.com/problems/convert-a-number-to-hexadecimal/
public class ConvertNumberToHexadecimal {

    //https://www.educative.io/blog/bit-manipulation-in-java
    public static void main(String args[]){

        ConvertNumberToHexadecimal cnth = new ConvertNumberToHexadecimal();

        /*Input: num = 26
        Output: "1a"*/
        System.out.println(cnth.toHex(26));

        System.out.println(cnth.toHex2(26));

        /* Input: num = -1
        Output: "ffffffff"*/
        System.out.println(cnth.toHex(-1));

        System.out.println(cnth.toHex2(-1));
    }

    //hexadecimal - base 16 - up to 16 characters
    //keep dividing the number by 16;
    //take the reminder
    //if the  reminder is > 9; use a letter to represent it => 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
    //in java, it does not work with negative numbers
    public String toHex(int num) {

        char[] hex = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder answer = new StringBuilder();
        while(num > 0){

            var res = num % 16;
            answer.append(hex[res]);
            num = num /16;
        }

        return answer.reverse().toString();
    }

  /*
    Bit manipulation solution from LeetCode

    For example, num = 4012
    1) What is 4012 in binary number?
       00000000000000000000111110101100

    2) How to convert a binary to hex presentation? We separate the binary in 8 groups, each group has 4 bits.
       0000 0000 0000 0000 0000 1111 1010 1100

    3) We create a while loop to read 4 bits each time. Since it's a 32-bit Integer,
       we can only execute this while loop 8 times. We also want to exit the while loop if the num is 0.
       while (loopCount < 8 && num != 0)

    4) How to read 4 bits each time?
        We can use & operation. 15 in binary is 1111. If we do num & 15, it will give you the last four bits.
        num & 15 will give you the number in range [0...15], we can use this to map to the hexChar array.
        0 -> 0 ....9 -> 9....10 -> a....15 -> f
        After each loop, we need to remove the last 4 bits. num = num >> 4, and also increment the loopCount by 1.

        This approach can also handle the negative case.
        For example -1 in binary is 1111 1111 1111 1111 1111 1111 1111 1111. We just apply the same logic above.
    */
    public String toHex2(int num){
        if (num == 0) {
            return "0";
        }
        char[] hex =
                new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder strBuilder = new StringBuilder();
        int count = 0;
        while (count < 8 && num != 0) {
            //& => if bother bits are 1, return 1; otherwise, return 0
            var hexNumIndex = num & 15;
            strBuilder.append(hex[hexNumIndex]);
            // >> performs a arithmatic shift keep the most significant one in the left and move 4 to right
            num = num >> 4;
            count++;
        }
        return strBuilder.reverse().toString();
    }
}
