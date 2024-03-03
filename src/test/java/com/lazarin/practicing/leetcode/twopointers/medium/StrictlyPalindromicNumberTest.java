package com.lazarin.practicing.leetcode.twopointers.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link StrictlyPalindromicNumber}
 */
public class StrictlyPalindromicNumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        StrictlyPalindromicNumber solution = new StrictlyPalindromicNumber();

        assertThat(solution.isStrictlyPalindromic(9), is(false));
        assertThat(solution.isStrictlyPalindromic(4), is(false));
    }
}
