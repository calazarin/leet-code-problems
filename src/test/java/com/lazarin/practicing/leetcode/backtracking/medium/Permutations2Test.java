package com.lazarin.practicing.leetcode.backtracking.medium;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * {@link Permutations2}
 */
public class Permutations2Test {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        Permutations2 solution = new Permutations2();

        var resp = solution.permuteUnique(new int[]{1,1,2});

        assertThat(resp, containsInAnyOrder(
                Arrays.asList(1,1,2),
                Arrays.asList(1,2,1),
                Arrays.asList(2,1,1)
        ));

        var resp2 = solution.permuteUnique(new int[]{1,2,3});

        assertThat(resp2, containsInAnyOrder(
                Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)
        ));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        Permutations2 solution = new Permutations2();

        var resp = solution.permuteUnique2(new int[]{1,1,2});

        assertThat(resp, containsInAnyOrder(
                Arrays.asList(1,1,2),
                Arrays.asList(1,2,1),
                Arrays.asList(2,1,1)
        ));

        var resp2 = solution.permuteUnique2(new int[]{1,2,3});

        assertThat(resp2, containsInAnyOrder(
                Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)
        ));
    }
}
