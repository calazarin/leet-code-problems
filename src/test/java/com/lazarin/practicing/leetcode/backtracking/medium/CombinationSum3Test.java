package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

/**
 * {@link CombinationSum3}
 */
public class CombinationSum3Test {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CombinationSum3 solution = new CombinationSum3();

        assertThat(solution.combinationSum3(3, 7), containsInAnyOrder(Arrays.asList(1,2,4)));

        assertThat(solution.combinationSum3(3, 9), containsInAnyOrder(
                Arrays.asList(1,2,6),
                Arrays.asList(1,3,5),
                Arrays.asList(2,3,4))
        );

        assertThat(solution.combinationSum3(4, 1), empty());
    }
}
