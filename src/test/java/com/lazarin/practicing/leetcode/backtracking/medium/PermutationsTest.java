package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * {@link Permutations}
 */
public class PermutationsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        Permutations solution = new Permutations();

        var resp = solution.permute(new int[]{1,2,3});

        assertThat(resp, containsInAnyOrder(
                Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)
        ));
    }
}
