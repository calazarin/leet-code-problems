package com.lazarin.practicing.leetcode.disjointset.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link com.lazarin.practicing.leetcode.disjointset.medium.NumberOfProvinces}
 */
public class NumberOfProvincesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        com.lazarin.practicing.leetcode.disjointset.medium.NumberOfProvinces solution = new
                com.lazarin.practicing.leetcode.disjointset.medium.NumberOfProvinces();

        assertThat(solution.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}}), is(2));
        assertThat(solution.findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}}), is(3));

    }
}
