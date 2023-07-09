package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindPivotIndex}
 */
public class FindPivotIndexTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        FindPivotIndex solution = new FindPivotIndex();

        assertThat(solution.pivotIndex(new int[]{1,7,3,6,5,6}), is(3));
        assertThat(solution.pivotIndex(new int[]{1,2,3}), is(-1));
    }

}