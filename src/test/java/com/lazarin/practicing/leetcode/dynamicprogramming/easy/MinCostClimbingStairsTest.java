package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MinCostClimbingStairs}
 */
public class MinCostClimbingStairsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        MinCostClimbingStairs solution = new MinCostClimbingStairs();

        assertThat(solution.minCostClimbingStairs(new int[]{10,15,20}), is(15));
        assertThat(solution.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}), is(6));
    }
}
