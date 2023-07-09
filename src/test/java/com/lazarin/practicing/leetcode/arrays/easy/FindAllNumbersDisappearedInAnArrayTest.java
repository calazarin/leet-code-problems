package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindAllNumbersDisappearedInAnArray}
 */
public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();

        assertThat(solution.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}), is(Arrays.asList(5,6)));
        assertThat(solution.findDisappearedNumbers(new int[]{1,1}), is(Arrays.asList(2)));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();

        assertThat(solution.findDisappearedNumbers2(new int[]{4,3,2,7,8,2,3,1}), is(Arrays.asList(5,6)));
        assertThat(solution.findDisappearedNumbers2(new int[]{1,1}), is(Arrays.asList(2)));
    }
}
