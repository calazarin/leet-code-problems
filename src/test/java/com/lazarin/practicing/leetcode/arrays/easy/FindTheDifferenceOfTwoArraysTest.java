package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * {@link FindTheDifferenceOfTwoArrays}
 */
public class FindTheDifferenceOfTwoArraysTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();

        assertThat(solution.findDifference(new int[]{1,2,3}, new int[]{2,4,6}),
                contains(Arrays.asList(1,3), Arrays.asList(4,6)));

        assertThat(solution.findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}),
                contains(Arrays.asList(3), new ArrayList<>()));

        assertThat( solution.findDifference(new int[]{-80,-15,-81,-28,-61,63,14,-45,-35,-10},
                new int[]{-1,-40,-44,41,10,-43,69,10,2}),
                contains(Arrays.asList(-81,-35,-10,-28,-61,-45,-15,14,-80,63),
                        Arrays.asList(-1,2,69,-40,41,10,-43,-44)));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();

        assertThat(solution.findDifference2(new int[]{1,2,3}, new int[]{2,4,6}),
                contains(Arrays.asList(1,3), Arrays.asList(4,6)));

        assertThat(solution.findDifference2(new int[]{1,2,3,3}, new int[]{1,1,2,2}),
                contains(Arrays.asList(3), new ArrayList<>()));

        assertThat(solution.findDifference2(new int[]{-80,-15,-81,-28,-61,63,14,-45,-35,-10},
                        new int[]{-1,-40,-44,41,10,-43,69,10,2}),
                contains(Arrays.asList(-81,-35,-10,-28,-61,-45,-15,14,-80,63),
                        Arrays.asList(-1,2,69,-40,41,10,-43,-44)));
    }
}
