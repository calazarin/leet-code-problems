package com.lazarin.practicing.leetcode.twopointers.medium;

import com.lazarin.practicing.leetcode.twopointers.easy.ReverseStringII;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link TwoSumIIInputArrayIsSorted}
 */
public class TwoSumIIInputArrayIsSortedTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        TwoSumIIInputArrayIsSorted solution = new TwoSumIIInputArrayIsSorted();

        assertThat(solution.twoSum(new int[]{2,7,11,15}, 9), is(new int[]{1,2}));
        assertThat(solution.twoSum(new int[]{2,3,4}, 6), is(new int[]{1,3}));
        assertThat(solution.twoSum(new int[]{-1,0}, -1), is(new int[]{1,2}));
    }

}
