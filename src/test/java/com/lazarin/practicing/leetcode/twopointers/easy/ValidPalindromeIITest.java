package com.lazarin.practicing.leetcode.twopointers.easy;

import com.lazarin.practicing.leetcode.arrays.easy.AddStrings;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ValidPalindromeII}
 */
public class ValidPalindromeIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        ValidPalindromeII solution = new ValidPalindromeII();

        assertThat(solution.validPalindrome("aba"), is(true));
        assertThat(solution.validPalindrome("abca"), is(true));
        assertThat(solution.validPalindrome("abc"), is(false));

    }
}
