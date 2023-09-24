package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link HouseRobber}
 */
public class HouseHobberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        HouseRobber solution = new HouseRobber();

        assertThat(solution.rob(new int[]{1, 2, 3, 1}), is(4));
        assertThat(solution.rob(new int[]{2, 7, 9, 3, 1}), is(12));
        assertThat(solution.rob(new int[]{0}), is(0));
    }
}
