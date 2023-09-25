package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ClimbingStairs}
 */
public class ClimbingStairsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ClimbingStairs solution = new ClimbingStairs();

        assertThat(solution.climbStairs(4), is(5));
        assertThat(solution.climbStairs(25), is(121393));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        ClimbingStairs solution = new ClimbingStairs();

        assertThat(solution.climbStairs2(4), is(5));
        assertThat(solution.climbStairs2(25), is(121393));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        ClimbingStairs solution = new ClimbingStairs();

        assertThat(solution.climbStairs3(4), is(5));
        assertThat(solution.climbStairs3(25), is(121393));
    }

}
