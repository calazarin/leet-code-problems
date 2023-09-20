package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * {@link Subsets}
 */
public class SubsetsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        Subsets solution = new Subsets();

        var resp = solution.subsets(new int[]{1, 2, 3});

        assertThat(resp, containsInAnyOrder(
                new ArrayList<>(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1,2),
                Arrays.asList(3),
                Arrays.asList(1,3),
                Arrays.asList(2,3),
                Arrays.asList(1,2,3)
        ));

        var resp2 = solution.subsets(new int[]{0});

        assertThat(resp2, containsInAnyOrder(
              new ArrayList<>(),
              Arrays.asList(0))
        );
    }
}
