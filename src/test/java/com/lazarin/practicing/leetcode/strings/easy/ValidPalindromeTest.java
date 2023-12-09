package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ValidPalindrome}
 */
public class ValidPalindromeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ValidPalindrome solution = new ValidPalindrome();
        assertThat(solution.isPalindrome("A man, a plan, a canal: Panama"), is(true));
        assertThat(solution.isPalindrome("race a car"), is(false));
    }
}
