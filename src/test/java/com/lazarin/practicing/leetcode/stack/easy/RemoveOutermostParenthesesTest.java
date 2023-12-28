package com.lazarin.practicing.leetcode.stack.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link RemoveOutermostParentheses}
 */
public class RemoveOutermostParenthesesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        assertThat(solution.removeOuterParentheses("(()())(())"), is("()()()"));
        assertThat(solution.removeOuterParentheses("(()())(())(()(()))"), is("()()()()(())"));
        assertThat(solution.removeOuterParentheses("()()"), is(""));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        assertThat(solution.removeOuterParentheses_2("(()())(())"), is("()()()"));
        assertThat(solution.removeOuterParentheses_2("(()())(())(()(()))"), is("()()()()(())"));
        assertThat(solution.removeOuterParentheses_2("()()"), is(""));
    }
}
