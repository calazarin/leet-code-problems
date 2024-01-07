package com.lazarin.practicing.leetcode.binarysearch.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CountPairsWhoseSumIsLessThanTarget}
 */
public class CountPairsWhoseSumIsLessThanTargetTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CountPairsWhoseSumIsLessThanTarget solution = new CountPairsWhoseSumIsLessThanTarget();

        assertThat(solution.countPairs(Arrays.asList(-1,1,2,3,1), 2), is(3));
        assertThat(solution.countPairs(Arrays.asList(-6,2,5,-2,-7,-1,3), -2), is(10));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        CountPairsWhoseSumIsLessThanTarget solution = new CountPairsWhoseSumIsLessThanTarget();

        assertThat(solution.countPairs_2(Arrays.asList(-1,1,2,3,1), 2), is(3));
        assertThat(solution.countPairs_2
                (Arrays.asList(-6,2,5,-2,-7,-1,3), -2), is(10));
    }
}
