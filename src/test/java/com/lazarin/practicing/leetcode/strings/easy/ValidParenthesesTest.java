package com.lazarin.practicing.leetcode.strings.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ValidParentheses}
 */
public class ValidParenthesesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        ValidParentheses solution = new ValidParentheses();
        assertThat(solution.isValid("()"), is(true));
        assertThat(solution.isValid("()[]{}"), is(true));
        assertThat(solution.isValid("(]"), is(false));
        assertThat(solution.isValid("([)]"), is(false));
    }

}
