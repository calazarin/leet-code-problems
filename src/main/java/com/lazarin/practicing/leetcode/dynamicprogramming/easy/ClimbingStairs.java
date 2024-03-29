package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] possibleSteps = new int[]{1, 2};
        return climbStarHelp(n, possibleSteps);
    }

    public int climbStarHelp(int currentLevel, int[] possibleSteps){

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

    /**
     * approach 2
     *  with dynamic programming - bottom up approach (memory optimization)
     *  T: O(N); S: O(1)
     */
    public int climbStairs2(int n) {
      int one = 1, two = 1;
      int three = 0;
      for(int i = 2; i <= n; i++){
          three = one + two;
          one = two;
          two = three;
      }
      return three;
    }

    /**
     * approach 3 -with dynamic programming - bottom up approach
     *  T: O(N); S: O(N )
     */
    public int climbStairs3(int n) {
        int[] dp = new int[n + 1];
        dp[0] =  1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i -1] + dp[i -2];
        }
        return dp[n];
    }

}
