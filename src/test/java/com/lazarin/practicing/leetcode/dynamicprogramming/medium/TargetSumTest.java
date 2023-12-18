package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link TargetSum}
 */
public class TargetSumTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        TargetSum solution = new TargetSum();
        assertThat(solution.findTargetSumWays_1(new int[]{1,1,1,1,1}, 3), is(5));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach1_test2(){
        TargetSum solution = new TargetSum();
        assertThat(solution.findTargetSumWays_1(new int[]{1}, 1), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        TargetSum solution = new TargetSum();
        assertThat(solution.findTargetSumWays_2(new int[]{1,1,1,1,1}, 3), is(5));
    }
}