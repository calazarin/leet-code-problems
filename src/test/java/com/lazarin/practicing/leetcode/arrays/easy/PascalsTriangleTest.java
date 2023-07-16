package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

/**
 * {@link PascalsTriangle}
 */
public class PascalsTriangleTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        PascalsTriangle solution = new PascalsTriangle();

        assertThat(solution.generate(5), hasItems(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1)
        ));

        assertThat(solution.generate(1), hasItems(Arrays.asList(1)));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        PascalsTriangle solution = new PascalsTriangle();

        assertThat(solution.generate2(5), hasItems(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1)
        ));

        assertThat(solution.generate2(1), hasItems(Arrays.asList(1)));
    }

}
