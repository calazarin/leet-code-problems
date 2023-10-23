package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link com.lazarin.practicing.leetcode.dynamicprogramming.medium.HouseRobberII}
 */
public class HouseRobberIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        HouseRobberII solution = new HouseRobberII();

        assertThat(solution.rob(new int[]{2,3,2}), is(3));
        assertThat(solution.rob(new int[]{1,2,3,1}), is(4));
        assertThat(solution.rob(new int[]{1,2,3}), is(3));
    }
}
