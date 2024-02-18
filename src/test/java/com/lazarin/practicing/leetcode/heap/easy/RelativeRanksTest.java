package com.lazarin.practicing.leetcode.heap.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link RelativeRanks}
 */
public class RelativeRanksTest {


    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        RelativeRanks solution = new RelativeRanks();
        assertThat(solution.findRelativeRanks(new int[]{5,4,3,2,1}),
                is(new String[]{"Gold Medal","Silver Medal","Bronze Medal","4","5"}));

        assertThat(solution.findRelativeRanks(new int[]{10,3,8,9,4}),
                is(new String[]{"Gold Medal","5","Bronze Medal","Silver Medal","4"}));
    }
}
