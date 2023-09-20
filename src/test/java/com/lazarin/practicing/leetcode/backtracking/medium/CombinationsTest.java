package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * {@link Combinations}
 */
public class CombinationsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        Combinations solution = new Combinations();

        var resp = solution.combine(4, 2);

        assertThat(resp, containsInAnyOrder(
                Arrays.asList(1,2),
                Arrays.asList(1,3),
                Arrays.asList(1,4),
                Arrays.asList(2,3),
                Arrays.asList(2,4),
                Arrays.asList(3,4)
        ));

        var resp2 = solution.combine(1,1);

        assertThat(resp2, containsInAnyOrder(
                Arrays.asList(1))
        );
    }
}
