package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

/**
 * {@link PascalsTriangle2}
 */
public class PascalsTriangle2Test {
    
    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        PascalsTriangle2 solution = new PascalsTriangle2();

        assertThat(solution.getRow(3), hasItems(1,3,3,1));
        assertThat(solution.getRow(0), hasItems(1));
        assertThat(solution.getRow(1), hasItems(1,1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        PascalsTriangle2 solution = new PascalsTriangle2();

        assertThat(solution.getRow2(3), hasItems(1,3,3,1));
        assertThat(solution.getRow2(0), hasItems(1));
        assertThat(solution.getRow2(1), hasItems(1,1));
    }

}
