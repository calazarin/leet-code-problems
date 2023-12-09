package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link CheckIfaParenthesesStringCanBeValid}
 */
public class CheckIfaParenthesesStringCanBeValidTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        CheckIfaParenthesesStringCanBeValid solution = new CheckIfaParenthesesStringCanBeValid();
        assertThat(solution.canBeValid("))()))", "010100"), is(true));
        assertThat(solution.canBeValid("()()", "0000"), is(true));
        assertThat(solution.canBeValid(")", "0"), is(false));
        assertThat(solution.canBeValid("(()())", "111111"), is(true));
        assertThat(solution.canBeValid(")(", "00"), is(true));
    }
}
