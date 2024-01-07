package com.lazarin.practicing.leetcode.binarysearch.easy;

import com.lazarin.practicing.leetcode.binarysearch.medium.FindPeakElement;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CountNegativeNumbersInaSortedMatrix}
 */
public class CountNegativeNumbersInaSortedMatrixTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CountNegativeNumbersInaSortedMatrix solution = new CountNegativeNumbersInaSortedMatrix();

        assertThat(solution.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}), is(8));
        assertThat(solution.countNegatives(new int[][]{{3,2},{1,0}}),is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        CountNegativeNumbersInaSortedMatrix solution = new CountNegativeNumbersInaSortedMatrix();

        assertThat(solution.countNegatives_2(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}), is(8));
        assertThat(solution.countNegatives_2(new int[][]{{3,2},{1,0}}),is(0));
    }
}
