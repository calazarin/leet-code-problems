package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * {@link Subsets2}
 */
public class Subsets2Test {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        Subsets2 solution = new Subsets2();

        var resp = solution.subsetsWithDup(new int[]{1, 2, 2});

        assertThat(resp, containsInAnyOrder(
                new ArrayList<>(),
                Arrays.asList(1),
                Arrays.asList(1,2),
                Arrays.asList(1,2,2),
                Arrays.asList(2),
                Arrays.asList(2,2)
        ));

        var resp2 = solution.subsetsWithDup(new int[]{0});

        assertThat(resp2, containsInAnyOrder(
              new ArrayList<>(),
              Arrays.asList(0))
        );
    }
}
