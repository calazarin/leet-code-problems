package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * {@link CombinationSum2}
 */
public class CombinationSum2Test {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CombinationSum2 solution = new CombinationSum2();

        assertThat(solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8),
                containsInAnyOrder(
                        Arrays.asList(1,1,6),
                        Arrays.asList(1,2,5),
                        Arrays.asList(1,7),
                        Arrays.asList(2,6)
                ));

        assertThat(solution.combinationSum2(new int[]{2,5,2,1,2}, 5),
                containsInAnyOrder(
                        Arrays.asList(1,2,2),
                        Arrays.asList(5))
        );
    }
}
