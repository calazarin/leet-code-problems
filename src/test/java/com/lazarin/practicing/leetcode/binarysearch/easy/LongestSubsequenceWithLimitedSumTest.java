package com.lazarin.practicing.leetcode.binarysearch.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestSubsequenceWithLimitedSum}
 */
public class LongestSubsequenceWithLimitedSumTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        LongestSubsequenceWithLimitedSum solution = new LongestSubsequenceWithLimitedSum();

        assertThat(solution.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21}), is(new int[]{2,3,4}));
        assertThat(solution.answerQueries(new int[]{2,3,4,5}, new int[]{1}),is(new int[]{0}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        LongestSubsequenceWithLimitedSum solution = new LongestSubsequenceWithLimitedSum();

        assertThat(solution.answerQueries_2(new int[]{4,5,2,1}, new int[]{3,10,21}), is(new int[]{2,3,4}));
        assertThat(solution.answerQueries_2(new int[]{2,3,4,5}, new int[]{1}),is(new int[]{0}));
    }
}
