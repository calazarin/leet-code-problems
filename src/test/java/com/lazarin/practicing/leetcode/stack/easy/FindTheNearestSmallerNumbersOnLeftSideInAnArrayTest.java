package com.lazarin.practicing.leetcode.stack.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link com.lazarin.practicing.leetcode.stack.easy.FindTheNearestSmallerNumbersOnLeftSideInAnArray}
 */
public class FindTheNearestSmallerNumbersOnLeftSideInAnArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        FindTheNearestSmallerNumbersOnLeftSideInAnArray solution = new FindTheNearestSmallerNumbersOnLeftSideInAnArray();
        assertThat(solution.solution(new int[]{1, 6, 4, 10, 2, 5}), is(new int[]{-1, 1, 1,  4, 1, 2}));

        assertThat(solution.solution(new int[]{1, 3, 0, 2, 5}), is(new int[]{-1, 1, -1, 0, 2}));
    }
}
