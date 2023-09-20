package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

/**
 * {@link CombinationSum}
 */
public class CombinationSumTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CombinationSum solution = new CombinationSum();

        assertThat(solution.combinationSum(new int[]{2,3,6,7}, 7),
                containsInAnyOrder(Arrays.asList(2,2,3), Arrays.asList(7)));

        assertThat(solution.combinationSum(new int[]{2,3,5}, 8),
                containsInAnyOrder(
                        Arrays.asList(2,2,2,2),
                        Arrays.asList(2,3,3),
                        Arrays.asList(3,5)));

        assertThat(solution.combinationSum(new int[]{2}, 1), empty());
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        CombinationSum solution = new CombinationSum();

        assertThat(solution.combinationSum2(new int[]{2,3,6,7}, 7),
                containsInAnyOrder(Arrays.asList(2,2,3), Arrays.asList(7)));

        assertThat(solution.combinationSum2(new int[]{2,3,5}, 8),
                containsInAnyOrder(
                        Arrays.asList(2,2,2,2),
                        Arrays.asList(2,3,3),
                        Arrays.asList(3,5)));

        assertThat(solution.combinationSum2(new int[]{2}, 1), empty());
    }

}
