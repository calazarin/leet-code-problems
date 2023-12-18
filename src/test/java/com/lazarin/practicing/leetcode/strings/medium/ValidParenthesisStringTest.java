package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link ValidParenthesisString}
 */
public class ValidParenthesisStringTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ValidParenthesisString solution = new ValidParenthesisString();
        assertThat(solution.checkValidString("()"), is(true));
        assertThat(solution.checkValidString("(*)"), is(true));
        assertThat(solution.checkValidString("(*))"), is(true));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        ValidParenthesisString solution = new ValidParenthesisString();
        assertThat(solution.checkValidString_2("()"), is(true));
        assertThat(solution.checkValidString_2("(*)"), is(true));
        assertThat(solution.checkValidString_2("(*))"), is(true));
    }
}
