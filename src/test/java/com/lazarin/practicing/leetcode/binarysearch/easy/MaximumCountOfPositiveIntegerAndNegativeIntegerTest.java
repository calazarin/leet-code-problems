package com.lazarin.practicing.leetcode.binarysearch.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaximumCountOfPositiveIntegerAndNegativeInteger}
 */
public class MaximumCountOfPositiveIntegerAndNegativeIntegerTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MaximumCountOfPositiveIntegerAndNegativeInteger solution = new MaximumCountOfPositiveIntegerAndNegativeInteger();

        assertThat(solution.maximumCount(new int[]{-2,-1,-1,1,2,3}), is(3));
        assertThat(solution.maximumCount(new int[]{-3,-2,-1,0,0,1,2}), is(3));
        assertThat(solution.maximumCount(new int[]{5,20,66,1314}), is(4));
    }
}
