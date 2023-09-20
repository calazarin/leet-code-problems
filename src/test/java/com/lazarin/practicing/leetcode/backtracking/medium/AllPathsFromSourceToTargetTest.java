package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * {@link AllPathsFromSourceToTarget}
 */
public class AllPathsFromSourceToTargetTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        AllPathsFromSourceToTarget solution = new AllPathsFromSourceToTarget();

        var resp = solution.allPathsSourceTarget(new int[][]{{1,2}, {3}, {3}, {}});

        assertThat(resp, containsInAnyOrder(
            Arrays.asList(0,1,3),
            Arrays.asList(0,2,3)
        ));

        var resp2 = solution.allPathsSourceTarget(new int[][]{{4,3,1}, {3,2,4}, {3}, {4},{}});

        assertThat(resp2, containsInAnyOrder(
            Arrays.asList(0,4),
            Arrays.asList(0,3,4),
            Arrays.asList(0,1,3,4),
            Arrays.asList(0,1,2,3,4),
            Arrays.asList(0,1,4)
        ));
    }
}
