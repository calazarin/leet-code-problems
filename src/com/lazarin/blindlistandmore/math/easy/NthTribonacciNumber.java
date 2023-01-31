package com.lazarin.blindlistandmore.math.easy;

//https://leetcode.com/problems/n-th-tribonacci-number/
public class NthTribonacciNumber {

    public static void main(String args[]){
        /*Input: n = 4
        Output: 4
        Explanation:
        T_3 = 0 + 1 + 1 = 2
        T_4 = 1 + 1 + 2 = 4*/
        System.out.println(tribonacci(4));

       /* Input: n = 25
        Output: 1389537*/
        System.out.println(tribonacci(25));
    }

    //approach 1
    public static int tribonacci(int n) {

        if(n == 0) {
            return 0;
        }

        if(n == 1 || n == 2){
            return 1;
        }

        return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
    }

    //approach 2
    public int tribonacci2(int n) {

        if(n == 0) {
            return 0;
        }

        if(n == 1 || n == 2){
            return 1;
        }

        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;

        for(int i = 3; i <= n; i++){
            memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
        }

        return memo[n];
    }
}
