package com.lazarin.practicing.leetcode.greedy.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link SplitAStringInBalancedStrings}
 */
public class SplitAStringInBalancedStringsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        SplitAStringInBalancedStrings solution = new SplitAStringInBalancedStrings();
        assertThat(solution.balancedStringSplit("RLRRLLRLRL"), is(4));
        assertThat(solution.balancedStringSplit("RLRRRLLRLL"), is(2));
        assertThat(solution.balancedStringSplit("LLLLRRRR"), is(1));
    }
}
