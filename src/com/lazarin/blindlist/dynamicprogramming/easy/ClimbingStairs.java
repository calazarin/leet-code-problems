package com.lazarin.blindlist.dynamicprogramming.easy;

public class ClimbingStairs {

    public static void main(String args[]){
        System.out.println(climbStairs3(2)); //2
        System.out.println(climbStairs3(3)); //3
    }

    public static int climbStairs(int n) {
        int[] possibleSteps = new int[]{1, 2};
        return climbStarHelp(n, possibleSteps);
    }

    public static int climbStarHelp(int currentLevel, int[] possibleSteps){

        if(currentLevel == 0) return 1;
        if(currentLevel < 0) return 0;

        int possibleWays = 0;
        for(int step : possibleSteps){
            var nextLevel = currentLevel - step;
            var result = climbStarHelp(nextLevel, possibleSteps);
            possibleWays = possibleWays + result;
        }
        return  possibleWays;
    }

    //with dynamic programming - bottom up approach
    public static int climbStairs2(int n) {
      int one = 1, two = 1;

      for(int i =0; i < n - 1; i++){
          var temp = one;
          one = one + two;
          two = temp;
      }
      return one;
    }

    //with dynamic programming - bottom up approach 2
    public static int climbStairs3(int n) {
        int[] dp = new int[n + 1];
        dp[0] =  1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i -1] + dp[i -2];
        }
        return dp[n];
    }

}
