package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestIncreasingSubsequence}
 */
public class LongestIncreasingSubsequenceTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();

        assertThat(solution.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}), is(4));
        assertThat(solution.lengthOfLIS(new int[]{0,1,0,3,2,3}), is(4));
        assertThat(solution.lengthOfLIS(new int[]{7,7,7,7,7,7,7}), is(1));
    }
}
